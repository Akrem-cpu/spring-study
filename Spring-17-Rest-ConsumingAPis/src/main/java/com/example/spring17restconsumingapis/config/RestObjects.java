package com.example.spring17restconsumingapis.config;

import com.example.spring17restconsumingapis.dto.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
public class RestObjects {

    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();

    }


}
