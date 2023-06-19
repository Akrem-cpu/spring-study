package com.example.demo.bootstrap;

import com.example.demo.enitity.Department;
import com.example.demo.enitity.Employee;
import com.example.demo.enitity.Regions;
import com.example.demo.enums.Gender;
import com.example.demo.repository.DepartmentsRepository;
import com.example.demo.repository.EmployeesRepository;
import com.example.demo.repository.ResgionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerter implements CommandLineRunner {
    @Autowired
    DepartmentsRepository departmentsRepository;
    @Autowired
    EmployeesRepository employeesRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20),154864, Gender.F);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26),56752, Gender.F);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17),95313, Gender.F);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014,03,02) ,119764,Gender.M);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), 55307,Gender.M);

        Department d1 = new Department("Sports","Outdoors");
        Department d2 = new Department("Tools","Hardware");
        Department d3 = new Department("Clothing","Home");
        Department d4 = new Department("Phones & Tablets","Electronics");
        Department d5 = new Department("Computers","Electronics");

        Regions r1 = new Regions("Southwest","United States");
        Regions r2 = new Regions("Central","United States");
        Regions r3 = new Regions("Northwest","United States");
        Regions r4 = new Regions("Quebec'","Canada");
        Regions r5 = new Regions("Central","Asia");

        e1.setDepartment(d1);
        e2.setDepartment(d2);
        e3.setDepartment(d3);
        e4.setDepartment(d4);
        e5.setDepartment(d5);

        e1.setRegions(r1);
        e2.setRegions(r2);
        e3.setRegions(r3);
        e4.setRegions(r4);
        e5.setRegions(r5);

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));

          employeesRepository.saveAll(employeeList);




    }
}
