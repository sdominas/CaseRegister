package pl.com.dominikj.caseregister.dao;

import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.com.dominikj.caseregister.model.Employee;
import pl.com.dominikj.caseregister.model.Section;

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
public class SectionDAOImp implements SectionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Section section) {
        sessionFactory.getCurrentSession().save(section);
    }

    @Override
    public List<Section> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Section> query = sessionFactory.getCurrentSession().createQuery("from Section");
        return query.getResultList();
    }

}
