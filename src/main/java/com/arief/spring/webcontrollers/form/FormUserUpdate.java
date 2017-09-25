package com.arief.spring.webcontrollers.form;

import com.arief.spring.services.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

@Controller
@RequestMapping("/user")
public class FormUserUpdate {


    @Autowired
    private UserService userService;


    private Logger log = Logger.getLogger(getClass().getName());

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String updateFormUserView(@PathVariable int id ,  Model m){

       log.info(userService.findOne(id).toString());

       m.addAttribute("user",userService.findOne(id));
       return "form/form-update";
    }


}
