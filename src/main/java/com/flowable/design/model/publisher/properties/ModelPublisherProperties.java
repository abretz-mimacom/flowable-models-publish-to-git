package com.flowable.design.model.publisher.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "flowable.design.git.repo")
public class ModelPublisherProperties {

    private boolean enabled;
    private String cloneDir;
    private String uri;
    private String remoteBranch;
    // private String username;
    // private String password;

    public String getCloneDir() {
        return cloneDir;
    }

    public void setCloneDir(String cloneDir) {
        this.cloneDir = cloneDir;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getRemoteBranch() {
        return remoteBranch;
    }

    public void setRemoteBranch(String remoteBranch) {
        this.remoteBranch = remoteBranch;
    }

    // public String getUsername() {
    //     return username;
    // }

    // public void setUsername(String username) {
    //     this.username = username;
    // }

    // public String getPassword() {
    //     return password;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
