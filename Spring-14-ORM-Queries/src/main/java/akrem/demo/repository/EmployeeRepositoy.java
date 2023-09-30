package akrem.demo.repository;

import akrem.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.List;
@Repository
public interface EmployeeRepositoy extends JpaRepository<Employee,Long> {

       // find by email
    List<Employee> findByEmailEquals(String email);

    //Display all employees with first name ' ' and last name ' ' , also show all employees with an email adress

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname, String lastName,String email);

    //Display all employees that first name is not ''
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees that first name start with ''
    List<Employee> findByFirstNameStartingWith(String firstName);

    //Dispaly all employees with salaries higher then ''
    List<Employee> findBySalaryGreaterThan(Integer salary);


    //Display all Employees that has been hired b/n '' and ''
    List<Employee> findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    //Dispaly all employees with salaries higher then '' or equal in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top 3 unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryGreaterThan(Integer salary);

    //Display all employee that do not have email adress
    List<Employee> findByEmailIsNull();

}
