/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.service;

import java.util.List;
import pl.com.dominikj.caseregister.model.Section;

/**
 *
 * @author dominik.jedrzejowski
 */
public interface SectionService {

    void save(Section section);

    List<Section> list();

    Section findByUserId(Long userId);

}
