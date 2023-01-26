package com.akrem.bootstrap;

import com.akrem.model.Student;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Student> createStudent(){
       String firstName;
       String lastName;
       int age;
       String state;
        Faker faker = new Faker();
        List<Student> students  = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
            age = faker.number().numberBetween(20,40);
            state = faker.address().state();
            students.add(new Student(firstName,lastName,age,state));
        }



        return students;
    }

}
