/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.com.dominikj.caseregister.dao.SectionDAO;
import pl.com.dominikj.caseregister.model.Employee;
import pl.com.dominikj.caseregister.service.EmployeeService;
import pl.com.dominikj.caseregister.service.SectionService;

/**
 *
 * @author dominik.jedrzejowski
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private SectionService sectionService;

    @RequestMapping("/add")
    public ModelAndView addEmployee() {

        Employee employee = new Employee();
        ModelAndView model = new ModelAndView("addEmployee");
        model.addObject("employee", employee);
        model.addObject("sections", sectionService.list());

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
            employeeService.save(employee);
            return "redirect:/employee/list.htm";
        }
    }

//    @RequestMapping("/list")
    @GetMapping("/")
    public ModelAndView list() {
        List<Employee> result = employeeService.list();

        ModelAndView model = new ModelAndView("employeeList");
        model.addObject("employees", result);

        return model;
    }

    @RequestMapping("edit")
    public ModelAndView edit(@RequestParam Long id) {
        ModelAndView model = new ModelAndView("addEmployee");
        Employee employee = employeeService.findByUserId(id);
        model.addObject("employee", employee);
        model.addObject("sections", sectionService.list());
        return model;
    }

//    @RequestMapping("edit")
//    public String edit(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("empoyee", this.employeeService.findByUserId(id));
//        model.addAttribute("employees", this.employeeService.list());
//        return "employee";
//    }

}
