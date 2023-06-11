package com.example.demo.enitity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long employeeId;

    String firstName;
    String lastName;
    String email;
    @Column(columnDefinition = "Date")
    String hireDate;



}
