/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.com.dominikj.caseregister.dao.RegisteredCaseDAO;
import pl.com.dominikj.caseregister.model.RegisteredCase;

/**
 *
 * @author dominik.jedrzejowski
 */
@Controller
@RequestMapping("/registeredcase")
public class RegisteredCaseController {
    
    @Autowired
    private RegisteredCaseDAO registeredCaseDAO;
    
    @RequestMapping("/add")
    public ModelAndView add(){
        
        ModelAndView model = new ModelAndView("add");
        model.addObject("registeredCase", new RegisteredCase() );
        
        return model;
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@Valid RegisteredCase registeredCase, BindingResult bindingResult){
        
        System.out.println(registeredCase);

        // bindingResult - validacja danych - adnotacja @Valid, 
        if(bindingResult.hasErrors()){
            return "add";
        }

        registeredCaseDAO.save(registeredCase);
        
        return "redirect:/home.htm";
    }
}
