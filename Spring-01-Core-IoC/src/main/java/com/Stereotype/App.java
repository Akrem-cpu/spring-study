package com.Stereotype;

import com.bean_annotation.ConfigApp;
import com.bean_annotation.FullTimeMentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCourse.class, ConfigApp.class);
        Java bean = container.getBean(Java.class);
        bean.getTeachingHours();
        container.getBean(FullTimeMentor.class).createAccount();
        System.out.println(container.getBean(String.class));

    }
}
