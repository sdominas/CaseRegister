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
import pl.com.dominikj.caseregister.model.RegCase;
import pl.com.dominikj.caseregister.dao.RegCaseDAO;

/**
 *
 * @author dominik.jedrzejowski
 */
@Controller
@RequestMapping("/regCase")
public class RegCaseController {

    @Autowired
    private RegCaseDAO regCaseDAO;

    @RequestMapping("/add")
    public ModelAndView add() {

        RegCase regCase = new RegCase();
        ModelAndView model = new ModelAndView("addRegCase");
        model.addObject("regCase", regCase);

        return model;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@Valid RegCase regCase, BindingResult bindingResult) {

        System.out.println(regCase);

        // bindingResult - validacja danych - adnotacja @Valid, 
        if (bindingResult.hasErrors()) {
            return "addRegCase";
        } else {
            System.out.println(regCase);
            regCaseDAO.save(regCase);
            return "redirect:/regCase/list.htm";
        }
    }

    @RequestMapping("/list")
    public ModelAndView list() {
        Iterable<RegCase> result = regCaseDAO.findAll();

        ModelAndView model = new ModelAndView("regCaseList");
        model.addObject("regCases", result);

        return model;
    }

    @RequestMapping("edit")
    public ModelAndView edit(@RequestParam int id) {

        ModelAndView model = new ModelAndView("addRegCase");

        RegCase regCase = regCaseDAO.findOne(id);
        model.addObject("regCase", regCase);
//        model.addObject("sections", sectionDAO.findAll());

        return model;
    }

}
