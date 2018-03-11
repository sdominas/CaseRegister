/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.dominikj.caseregister.dao.RegCaseDAO;

/**
 *
 * @author dominik.jedrzejowski
 */
@Service
public class RegCaseServiceImp implements RegCaseService {

    @Autowired
    private RegCaseDAO regCaseDAO;

}
