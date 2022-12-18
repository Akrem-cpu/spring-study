package com.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
       ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);
        Object str = container.getBean("str");
        System.out.println(str);


        FullTimeMentor bean = container.getBean(FullTimeMentor.class);
        PartTimeMentor bean1 = container.getBean(PartTimeMentor.class);
        bean1.createAccount();
        bean.createAccount();


    }
}
