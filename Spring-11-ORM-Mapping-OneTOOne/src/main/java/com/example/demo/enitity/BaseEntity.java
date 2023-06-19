package com.example.demo.enitity;

import javax.persistence.*;


@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


}
