package pl.com.dominikj.caseregister.dao;

import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
@Repository
public class EmployeeDAOImp implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Employee employee) {
      sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public List<Employee> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Employee> query = sessionFactory.getCurrentSession().createQuery("from Employee");
        return query.getResultList();
    }

}
