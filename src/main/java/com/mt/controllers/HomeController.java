package com.mt.controllers;

import com.mt.service.UserService;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("users", this.userService.getUsers());
        return "index";
    }
}
