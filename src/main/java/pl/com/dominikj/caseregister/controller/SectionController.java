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
import pl.com.dominikj.caseregister.dao.SectionDAO;
import pl.com.dominikj.caseregister.model.Employee;
import pl.com.dominikj.caseregister.model.Section;

/**
 *
 * @author dominik.jedrzejowski
 */
@Controller
@RequestMapping("/section")
public class SectionController {

    @Autowired
    private SectionDAO sectionDAO;

    @RequestMapping("/add")
    public ModelAndView addSection() {
        Section section = new Section();
        ModelAndView model = new ModelAndView("addSection");
        model.addObject("section", section);
        return model;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@Valid Section section, BindingResult bindingResult) {

        System.out.println(section);

        // bindingResult - validacja danych - adnotacja @Valid, 
        if (bindingResult.hasErrors()) {
            return "addSection";
        } else {
            System.out.println(section);
            sectionDAO.save(section);
            return "redirect:/section/list.htm";
        }
    }

    @RequestMapping("/list")
    public ModelAndView list() {
        Iterable<Section> result = sectionDAO.findAll();

        ModelAndView model = new ModelAndView("sectionList");
        model.addObject("sections", result);

        return model;
    }

    @RequestMapping("edit")
    public ModelAndView edit(@RequestParam int id) {

        ModelAndView model = new ModelAndView("addSection");

        Section section = sectionDAO.findOne(id);
        model.addObject("section", section);

        return model;
    }

}
