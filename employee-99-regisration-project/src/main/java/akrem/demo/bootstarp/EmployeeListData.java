package akrem.demo.bootstarp;

import akrem.demo.model.Employee;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class EmployeeListData {
    private static List<Employee> employeeList = new ArrayList<>();

    public static  void saveEmployee(Employee employee){
        employeeList.add(employee);
    }
    public static List<Employee> getEmployeeList(){
        return employeeList;
    }

}
