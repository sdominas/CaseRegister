package pl.com.dominikj.caseregister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.com.dominikj.caseregister.dao.EmployeeDAO;
import pl.com.dominikj.caseregister.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

   @Autowired
   private EmployeeDAO employeeDAO;

   @Transactional
   public void save(Employee employee) {
      employeeDAO.save(employee);
   }

   @Transactional(readOnly = true)
   public List<Employee> list() {
      return employeeDAO.list();
   }
}
