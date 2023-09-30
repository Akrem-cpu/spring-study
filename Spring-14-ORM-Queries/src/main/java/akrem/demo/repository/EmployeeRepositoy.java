package akrem.demo.repository;

import akrem.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepositoy extends JpaRepository<Employee,Long> {


    List<Employee> findByHireDateAfter(LocalDate date);
}
