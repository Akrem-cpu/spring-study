package akrem.demo.repository;

import akrem.demo.entity.Department;
import akrem.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@EnableJpaRepositories
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    //Display all Departments in the furniture department
    List<Department> findByDepartment(String department);
    //Display all Departments in health division
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);


    // Display top 3 departments with division name includes 'hea', with out duplicate
    List<Department> findDistinctTop3ByDivisionContaining(String division);

    @Query("select d from Department d where d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);


    List<Department> retrieveDepartmentByDivision( String department);

}
