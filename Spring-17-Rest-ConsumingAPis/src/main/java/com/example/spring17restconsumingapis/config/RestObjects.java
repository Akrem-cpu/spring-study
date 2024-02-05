package com.example.spring17restconsumingapis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestObjects {

    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();

    }

}
