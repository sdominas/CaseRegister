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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.com.dominikj.caseregister.dao.EmployeeDAO;
import pl.com.dominikj.caseregister.dao.SectionDAO;
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

    @Autowired
    private SectionDAO sectionDAO;

    @RequestMapping("/add")
    public ModelAndView addEmployee() {

        Employee employee = new Employee();
        ModelAndView model = new ModelAndView("addEmployee");
        model.addObject("employee", employee);
        model.addObject("sections", sectionDAO.findAll());

        return model;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@Valid Employee employee, BindingResult bindingResult) {

        System.out.println(employee);

        // bindingResult - validacja danych - adnotacja @Valid, 
        if (bindingResult.hasErrors()) {
            return "addEmployee";
        } else {
            System.out.println(employee);
            employeeDAO.save(employee);
            return "redirect:/employee/list.htm";
        }
    }

    @RequestMapping("/list")
    public ModelAndView list() {
        Iterable<Employee> result = employeeDAO.findAll();

        ModelAndView model = new ModelAndView("employeeList");
        model.addObject("employees", result);

        return model;
    }

    @RequestMapping("edit")
    public ModelAndView edit(@RequestParam int id) {

        ModelAndView model = new ModelAndView("addEmployee");

        Employee employee = employeeDAO.findOne(id);
        model.addObject("employee", employee);
        model.addObject("sections", sectionDAO.findAll());

        return model;
    }

    @RequestMapping("/regCase")
    public ModelAndView regCases(int employeeId) {
        ModelAndView model = new ModelAndView("regCaseListForEmployee");
        model.addObject("employee", employeeDAO.findOne(employeeId));
        return model;
    }

    @RequestMapping("/search")
    public ModelAndView search(String name) {

        Iterable<Employee> res = employeeDAO.findByJPQL(name + "%");

        ModelAndView model = new ModelAndView("employeeList");
        model.addObject("employees", res);

        return model;

    }
}
