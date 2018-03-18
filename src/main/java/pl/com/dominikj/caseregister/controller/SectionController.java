/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.controller;

import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.com.dominikj.caseregister.model.Section;
import pl.com.dominikj.caseregister.service.SectionService;

/**
 *
 * @author dominik.jedrzejowski
 */
@Controller
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @GetMapping("/section/add")
    public String selectionForm(Locale locale, Model model) {
        model.addAttribute("sections", sectionService.list());
        return "editSection";
    }

    @ModelAttribute("section")
    public Section formBackingObject() {
        return new Section();
    }

    @PostMapping("/section/add")
    public String saveSelection(@ModelAttribute("section") @Valid Section section, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("sections", sectionService.list());
            return "editSection";
        }

        sectionService.save(section);
        return "redirect:/section/add";
    }

    @GetMapping("/section/remove")
    public String deleteSection(@RequestParam Long id) {

        Section section = sectionService.findByUserId(id);
        sectionService.delete(section);
        return "redirect:/section/add";
    }

}
