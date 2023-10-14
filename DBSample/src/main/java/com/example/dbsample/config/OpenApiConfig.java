package com.example.dbsample.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OpenApiConfig {
    @Bean
    GroupedOpenApi userApi(){
        return GroupedOpenApi.builder().group("user").pathsToMatch("/user/**").build();
    }
    @Bean
    GroupedOpenApi adminApi(){
        return GroupedOpenApi.builder().group("admin").pathsToMatch("/admin/**").build();
    }
}