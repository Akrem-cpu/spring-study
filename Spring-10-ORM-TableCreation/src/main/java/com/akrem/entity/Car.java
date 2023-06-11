package com.akrem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@NoArgsConstructor
@Data
@Component
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
