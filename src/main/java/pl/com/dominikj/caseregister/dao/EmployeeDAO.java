package pl.com.dominikj.caseregister.dao;

import org.springframework.data.repository.CrudRepository;
import pl.com.dominikj.caseregister.model.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik.jedrzejowski
 */
public interface EmployeeDAO extends CrudRepository<Employee, Integer>{
    
}