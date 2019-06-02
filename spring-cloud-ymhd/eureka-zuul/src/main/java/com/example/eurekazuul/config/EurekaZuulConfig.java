package com.example.eurekazuul.config;

import com.example.eurekazuul.filter.AuthFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EurekaZuulConfig {

    @Bean
    public AuthFilter authFilter(){
        return new AuthFilter();
    }
}
