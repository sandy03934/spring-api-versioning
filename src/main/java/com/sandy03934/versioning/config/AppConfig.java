package com.sandy03934.versioning.config;

import com.sandy03934.versioning.service.SearchServiceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

@Configuration
@ComponentScan("com.sandy03934.versioning")
@Slf4j
public class AppConfig {
        @Bean
        public ServiceLocatorFactoryBean serviceLocatorFactoryBean(@Value("${service.mapping.location:classpath:META-INF/service-mappings.properties}") Resource serviceMappings) {
                ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
                factoryBean.setServiceLocatorInterface(SearchServiceFactory.class);
                try {
                        factoryBean.setServiceMappings(PropertiesLoaderUtils.loadProperties(serviceMappings));
                } catch (IOException e) {
                        log.warn("Can't load the service mappings properties file");
                }
                return factoryBean;
        }
}
