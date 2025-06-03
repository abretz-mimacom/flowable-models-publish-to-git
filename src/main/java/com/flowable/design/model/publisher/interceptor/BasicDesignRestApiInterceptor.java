package com.flowable.design.model.publisher.interceptor;

import com.flowable.design.engine.api.ModelResource;
import com.flowable.design.engine.api.ModelType;
import com.flowable.design.engine.api.PackageType;
import com.flowable.design.engine.api.history.ModelHistory;
import com.flowable.design.engine.api.history.PackageRevision;
import com.flowable.design.engine.api.management.Workspace;
import com.flowable.design.engine.api.runtime.Model;
import com.flowable.design.rest.service.api.DesignRestApiInterceptor;
import com.flowable.design.rest.service.api.model.*;
import com.flowable.design.rest.service.api.model._import.ImportModelRequest;
import com.flowable.design.rest.service.api.model.clone.ModelDuplicateRequest;
import com.flowable.design.rest.service.api.model.export.ExportPackageRequest;
import com.flowable.design.rest.service.api.model.history.ModelHistoryActionRequest;
import com.flowable.design.rest.service.api.model.history.PackageRevisionCreateRequest;
import com.flowable.design.rest.service.api.model.translation.Translation;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public class BasicDesignRestApiInterceptor implements DesignRestApiInterceptor {

    @Override
    public void updatePackage(Workspace workspace, Model packageModel, PackageModelUpdateRequest request) {

    }

    @Override
    public void updatePackageKey(Workspace workspace, Model packageModel, ModelUpdateKeyRequest request) {

    }

    @Override
    public void updatePackageModels(Workspace workspace, Model packageModel, PackageModelUpdateModelsRequest request) {

    }

    @Override
    public void refreshPackageRelations(Workspace workspace, Model packageModel) {

    }

    @Override
    public void updateModelContent(Workspace workspace, Model packageModel, Model model, ModelContentUpdateRequest request) {

    }

    @Override
    public void updateModelContent(Workspace workspace, Model model, ModelContentUpdateRequest request) {

    }

    @Override
    public void updateModel(Workspace workspace, Model packageModel, Model model, ModelUpdateRequest request) {

    }

    @Override
    public void updateModelKey(Workspace workspace, Model packageModel, Model model, ModelUpdateKeyRequest request) {

    }

    @Override
    public void updateModel(Workspace workspace, Model model, ModelUpdateRequest request) {

    }

    @Override
    public void updateModelKey(Workspace workspace, Model model, ModelUpdateKeyRequest request) {

    }

    @Override
    public void publishApp(Workspace workspace, Model appModel, AppPublishRequest request) {

    }

    @Override
    public void exportPackage(Workspace workspace, Model packageModel, ExportPackageRequest request) {

    }

    @Override
    public void duplicateModel(Workspace workspace, Model model, ModelDuplicateRequest request) {

    }

    @Override
    public void duplicateModel(Workspace workspace, Model packageModel, Model baseModel, ModelDuplicateRequest request) {

    }

    @Override
    public void deletePackage(Workspace workspace, Model packageModel, PackageDeleteRequest request) {

    }

    @Override
    public void deleteModel(Workspace workspace, Model model, DeleteModelInWorkspaceRequest request) {

    }

    @Override
    public void deleteModel(Workspace workspace, Model packageModel, Model model, ModelDeleteRequest request) {

    }

    @Override
    public void createModel(Workspace workspace, ModelCreateRequest request) {

    }

    @Override
    public void createModel(Workspace workspace, Model packageModel, ModelCreateRequest request) {

    }

    @Override
    public void migrateModel(Workspace workspace, Model model) {

    }

    @Override
    public void migrateModel(Workspace workspace, Model packageModel, Model model) {

    }

    @Override
    public void exportModel(Workspace workspace, Model packageModel, Model model) {

    }

    @Override
    public void exportModel(Workspace workspace, Model packageModel, Model model, int version) {

    }

    @Override
    public void importPackageModel(Workspace workspace, PackageType packageType, ImportModelRequest request) {

    }

    @Override
    public void importModel(Workspace workspace, ModelType modelType, ImportModelRequest request) {

    }

    @Override
    public void importModel(Workspace workspace, Model packageModel, ModelType modelType, ImportModelRequest request) {

    }

    @Override
    public void importModels(Workspace workspace, Model packageModel, List<MultipartFile> files, String importStrategy) {

    }

    @Override
    public void importAndUpdateModel(Workspace workspace, Model model, ModelType modelType, ImportModelRequest request) {

    }

    @Override
    public void createPackageRevision(Workspace workspace, Model packageModel, PackageRevisionCreateRequest request) {

    }

    @Override
    public void deletePackageRevision(Workspace workspace, Model packageModel, PackageRevision packageRevision) {

    }

    @Override
    public void publishPackageRevision(Workspace workspace, Model appModel, PackageRevision packageRevision, AppPublishRequest request) {

    }

    @Override
    public void revertPackageToRevision(Workspace workspace, Model packageModel, PackageRevision packageRevision) {

    }

    @Override
    public void copyRevisionIntoPackage(Workspace workspace, Model packageModel, PackageRevision packageRevision) {

    }

    @Override
    public byte[] downloadPackageRevision(Workspace workspace, Model packageModel, PackageRevision packageRevision, byte[] revisionExportBytes) {
        return new byte[0];
    }

    @Override
    public void copyRevisionIntoWorkspace(Workspace workspace, PackageRevision packageRevision) {

    }

    @Override
    public void revertModelToVersion(Workspace workspace, Model packageModel, Model model, ModelHistory modelHistory, ModelHistoryActionRequest request) {

    }

    @Override
    public void deleteHistoryModelsForModel(Workspace workspace, Model packageModel, Model model) {

    }

    @Override
    public void deleteHistoryModelsForModel(Workspace workspace, Model model) {

    }

    @Override
    public void lockModel(Workspace workspace, Model model) {

    }

    @Override
    public void lockModel(Workspace workspace, Model packageModel, Model model) {

    }

    @Override
    public void unlockModel(Workspace workspace, Model model, boolean force) {

    }

    @Override
    public void uploadDocumentTemplateResource(Workspace workspace, Model model) {

    }

    @Override
    public void uploadDocumentTemplateResource(Workspace workspace, Model packageModel, Model model) {

    }

    @Override
    public void updateDocumentTemplateResource(Workspace workspace, Model packageModel, Model model) {

    }

    @Override
    public void updateDocumentTemplateResource(Workspace workspace, Model model) {

    }

    @Override
    public void deleteTemplateResource(Workspace workspace, Model packageModel, Model model) {

    }

    @Override
    public void deleteTemplateResource(Workspace workspace, Model model) {

    }

    @Override
    public void importPackageTranslations(Workspace workspace, Model packageModel, Map<String, Translation> translations) {

    }

    @Override
    public void uploadPackageDocumentResource(Workspace workspace, Model packageModel) {

    }

    @Override
    public void updatePackageDocumentResource(Workspace workspace, Model packageModel) {

    }

    @Override
    public void deletePackageDocumentResource(Workspace workspace, Model packageModel, ModelResource resource) {

    }

    @Override
    public void movePackage(Workspace workspace, Model packageModel, PackageMoveWorkspaceRequest request, Workspace targetWorkSpace) {

    }
}
