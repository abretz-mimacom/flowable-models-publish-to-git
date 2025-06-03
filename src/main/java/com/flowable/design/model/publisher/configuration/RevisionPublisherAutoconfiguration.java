package com.flowable.design.model.publisher.configuration;

import com.flowable.design.model.publisher.interceptor.BasicDesignRestApiInterceptor;
import com.flowable.design.rest.service.api.DesignRestApiInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix = "flowable.design.git.repo", name = "enabled", havingValue = "true")
public class RevisionPublisherAutoconfiguration {
    @ConditionalOnMissingBean(DesignRestApiInterceptor.class)
    @Bean
    public DesignRestApiInterceptor basicDesignRestApiInterceptor(){
        return new BasicDesignRestApiInterceptor();
    }
}
