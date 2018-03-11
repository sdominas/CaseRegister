/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.service;

import java.util.List;
import pl.com.dominikj.caseregister.model.RegCase;

/**
 *
 * @author dominik.jedrzejowski
 */
public interface RegCaseService {

    void save(RegCase regCase);

    List<RegCase> list();

    RegCase findByUserId(Long userId);

}
