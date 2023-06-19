package com.example.demo.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Component
@ToString
@NoArgsConstructor
public class Department extends BaseEntity {
    private String department;
    private String division;

    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
