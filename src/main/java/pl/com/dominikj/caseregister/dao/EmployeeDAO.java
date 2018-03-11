/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pl.com.dominikj.caseregister.model.Employee;

/**
 *
 * @author dominik.jedrzejowski
 */
public interface EmployeeDAO {

    void save(Employee employee);

    List<Employee> list();
    
    Employee findByUserId(Long userId);
}
