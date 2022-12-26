package com.akrem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com/akrem/repository","com/akrem/proxy","com/akrem/serivce"})
//@ComponentScan(basePackages = "com/akrem")
public class ProjectConfig {
}
