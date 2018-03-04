package pl.com.dominikj.caseregister.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
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
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

    public Iterable<Employee> findByNameLike(String name);

    @Query("select e from Employee e where e.name like :name order by e.name")
    public Iterable<Employee> findByJPQL(@Param("name") String name);

}
