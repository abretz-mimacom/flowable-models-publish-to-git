package com.flowable.design.model.publisher;

import com.flowable.autoconfigure.design.DesignEngineAutoConfiguration;
import com.flowable.design.model.publisher.interceptor.BasicDesignRestApiInterceptor;
import com.flowable.design.model.publisher.properties.ModelPublisherProperties;
import com.flowable.design.rest.service.api.DesignRestApiInterceptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnProperty(prefix = "flowable.design.git.repo", name = "enabled", havingValue = "true")
@AutoConfiguration(after = {
    DesignEngineAutoConfiguration.class})
@EnableConfigurationProperties(ModelPublisherProperties.class)
public class RevisionPublisherAutoconfiguration {
    @ConditionalOnMissingBean(DesignRestApiInterceptor.class)
    @Bean
    public DesignRestApiInterceptor basicDesignRestApiInterceptor(){
        return new BasicDesignRestApiInterceptor();
    }
}
