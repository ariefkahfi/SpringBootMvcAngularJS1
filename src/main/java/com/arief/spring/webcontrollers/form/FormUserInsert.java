package com.arief.spring.webcontrollers.form;

import com.arief.spring.entity.User;
import com.arief.spring.services.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/user")
public class FormUserInsert {

    @RequestMapping("/save")
    public String formSaveView(Model m ){
       m.addAttribute("user",new User());
       return "form/form-insert";
    }

}
