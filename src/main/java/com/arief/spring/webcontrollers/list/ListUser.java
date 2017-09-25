package com.arief.spring.webcontrollers.list;

import com.arief.spring.services.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ListUser {

    @RequestMapping("/list")
    public String listViewForUser(){
        return "list/list-user";
    }

}
