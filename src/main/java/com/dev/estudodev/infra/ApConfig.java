package com.dev.estudodev.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApConfig {
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
