/*
 * Copyright 2011-08-31 the original author or authors.
 */
package pl.com.dominikj.caseregister.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dominik.jedrzejowski
 */
@Controller
public class MainController {
    
    protected Logger logger = Logger.getLogger(getClass());
    
    @RequestMapping("/home")
    public ModelAndView home() {
        
        logger.debug("MainController.home()");
        
        return new ModelAndView("home");
    }
    
}
