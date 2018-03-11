/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.com.dominikj.caseregister.dao.RegCaseDAO;
import pl.com.dominikj.caseregister.model.RegCase;

/**
 *
 * @author dominik.jedrzejowski
 */
@Service
public class RegCaseServiceImp implements RegCaseService {

    @Autowired
    private RegCaseDAO regCaseDAO;

    @Transactional
    public void save(RegCase regCase) {
        regCaseDAO.save(regCase);
    }

    @Transactional(readOnly = true)
    public List<RegCase> list() {
        return regCaseDAO.list();
    }

    @Transactional
    public RegCase findByUserId(Long userId) {
        return regCaseDAO.findByUserId(userId);
    }
    
}
