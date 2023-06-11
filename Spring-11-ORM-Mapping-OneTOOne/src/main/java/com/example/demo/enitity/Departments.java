package com.example.demo.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long division;

}
