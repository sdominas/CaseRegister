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
import pl.com.dominikj.caseregister.dao.SectionDAO;
import pl.com.dominikj.caseregister.model.Section;

/**
 *
 * @author dominik.jedrzejowski
 */
@Service
public class SectionServiceImp implements SectionService {

    @Autowired
    private SectionDAO sectionDAO;

    @Transactional
    public void save(Section section) {
        sectionDAO.save(section);
    }

    @Transactional
    public void delete(Section section) {
        sectionDAO.delete(section);
    }

    @Transactional(readOnly = true)
    public List<Section> list() {
        return sectionDAO.list();
    }

    @Transactional
    public Section findByUserId(Long userId) {
        return sectionDAO.findByUserId(userId);
    }

}
