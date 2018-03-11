package pl.com.dominikj.caseregister.dao;

import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.com.dominikj.caseregister.model.RegCase;

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
public class RegCaseDAOImp implements RegCaseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(RegCase regCase) {
        sessionFactory.getCurrentSession().save(regCase);
    }

    @Override
    public List<RegCase> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<RegCase> query = sessionFactory.getCurrentSession().createQuery("from RegCase");
        return query.getResultList();
    }

}
