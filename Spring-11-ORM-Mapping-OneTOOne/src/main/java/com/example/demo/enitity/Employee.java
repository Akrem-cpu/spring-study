package com.example.demo.enitity;

import com.example.demo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Component
@ToString
@NoArgsConstructor
public class Employee extends BaseEntity {


   private String firstName;
   private String lastName;
  private   String email;
    @Column(columnDefinition = "Date")
   private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
   private Gender gender;

   @OneToOne(cascade =  {CascadeType.PERSIST, CascadeType.REMOVE})
//    //@JoinColumn(name = "Deea")
//    // change the name of the joined column
    private Department department;
   @OneToOne(cascade =  {CascadeType.PERSIST, CascadeType.REMOVE})
   private Regions regions;



    public Employee(String firstName, String lastName, String email, LocalDate hireDate,  Integer salary,Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }

    Integer salary;





}
