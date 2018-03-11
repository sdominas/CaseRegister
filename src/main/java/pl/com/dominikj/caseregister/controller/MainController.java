/*
 * Copyright 2018-03-02 the original author or authors.
 */
package pl.com.dominikj.caseregister.controller;

import java.util.Locale;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dominik.jedrzejowski
 */
@Controller
public class MainController {
    
    protected Logger logger = Logger.getLogger(getClass());
    
    @RequestMapping("/")
    public ModelAndView home(Locale locale, Model model) {
        
        logger.debug("MainController.home()");
        
        return new ModelAndView("home");
    }
    
}
