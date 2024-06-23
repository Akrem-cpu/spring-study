package com.example.spring17restconsumingapis;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
//@EnableFeignClients
public class Spring17RestConsumingAPisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring17RestConsumingAPisApplication.class, args);
	}

     @Bean
	 public OpenAPI customOpenAPI(){
		return new OpenAPI()
				.info(new Info().title("WebClint OpenAPI").version("v2").description("this is a test for OpenAPi in spring boot"));
	 }

}
