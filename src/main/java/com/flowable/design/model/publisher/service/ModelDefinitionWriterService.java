package com.flowable.design.model.publisher.service;

import com.flowable.design.engine.api.history.AppRevision;
import com.flowable.design.engine.api.history.ModelHistoryService;
import com.flowable.design.model.publisher.properties.ModelPublisherProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
@EnableConfigurationProperties(ModelPublisherProperties.class)
public class ModelDefinitionWriterService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelDefinitionWriterService.class);

    @Autowired
    ModelHistoryService modelHistoryService;
    private byte[] buffer = new byte[1024];

    public void saveFilesFilesystem(AppRevision appRevision, String destDir) throws IOException {
        byte[] revisionExportBytes = modelHistoryService.getAppRevisionExportBytes(appRevision.getId());
        String destResourcesPath = destDir + File.separator + "src" + File.separator + "main" + File.separator + "resources";
        String destAppsPath =  destResourcesPath + File.separator + "apps";

        // write zip file
        File zip = new File(destAppsPath);
        zip.mkdirs();
        FileOutputStream fos = new FileOutputStream(destAppsPath + File.separator + appRevision.getAppKey().concat(".zip"));
        fos.write(revisionExportBytes);
        fos.close();

        // write individual files
        File destination = new File(destResourcesPath + File.separator + "models" + File.separator + appRevision.getAppKey());
        destination.mkdirs();
        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(revisionExportBytes));
        ZipEntry zipEntry = zis.getNextEntry();

        while (zipEntry != null) {
            File newFile = newFile(destination, zipEntry);
            if (zipEntry.isDirectory()) {
                if (!newFile.isDirectory() && !newFile.mkdirs()) {
                    throw new IOException("Failed to create directory " + newFile);
                }
            } else {
                // fix for Windows-created archives
                File parent = newFile.getParentFile();
                if (!parent.isDirectory() && !parent.mkdirs()) {
                    throw new IOException("Failed to create directory " + parent);
                }

                // write file content
                FileOutputStream currentFos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    currentFos.write(buffer, 0, len);
                }
                currentFos.close();
            }
            zipEntry = zis.getNextEntry();
        }
        zis.closeEntry();
        zis.close();
    }

    protected static File newFile(File destination, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destination, zipEntry.getName());

        String destDirPath = destination.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();

        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
        }

        return destFile;
    }
}
