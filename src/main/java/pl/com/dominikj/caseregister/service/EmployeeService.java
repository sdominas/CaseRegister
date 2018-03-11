package pl.com.dominikj.caseregister.service;

import java.util.List;
import pl.com.dominikj.caseregister.model.Employee;


public interface EmployeeService {
   void save(Employee employee);

   List<Employee> list();

}
