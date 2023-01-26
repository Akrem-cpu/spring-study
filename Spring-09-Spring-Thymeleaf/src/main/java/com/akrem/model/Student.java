package com.akrem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private String state;
}
