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
import pl.com.dominikj.caseregister.dao.EmployeeDAO;
import pl.com.dominikj.caseregister.model.Employee;

/**
 *
 * @author dominik.jedrzejowski
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
     
    @Autowired
    private EmployeeDAO employeeDAO;
    
    @RequestMapping("/add")
    public ModelAndView add(){
        
        ModelAndView model = new ModelAndView("addemployee");
        model.addObject("employee", new Employee() );
        
        return model;
    }
    
    @RequestMapping(value = "/saveemployee", method = RequestMethod.POST)
    public String save(@Valid Employee employee, BindingResult bindingResult){
        
        System.out.println(employee);

        // bindingResult - validacja danych - adnotacja @Valid, 
        if(bindingResult.hasErrors()){
            return "addemployee";
        }

        employeeDAO.save(employee);
        
        return "redirect:/home.htm";
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        Iterable<Employee> result = employeeDAO.findAll();
        
        ModelAndView model = new ModelAndView("employeeList");
        model.addObject("employee", result );
        
        return model;
    }
}