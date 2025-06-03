package com.flowable.design.model.publisher;

import com.flowable.design.model.publisher.interceptor.BasicDesignRestApiInterceptor;
import com.flowable.design.rest.service.api.DesignRestApiInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@AutoConfiguration(after = {
//    DesignEngineAutoConfiguration.class})
//@ConditionalOnProperty(prefix = "flowable.design.git.repo", name = "enabled", havingValue = "true")
@Configuration
public class RevisionPublisherAutoconfiguration {
    @ConditionalOnMissingBean(DesignRestApiInterceptor.class)
    @Bean
    public DesignRestApiInterceptor basicDesignRestApiInterceptor(){
        return new BasicDesignRestApiInterceptor();
    }
}
