package com.it355.draganmitic.controller;

import com.it355.draganmitic.dao.UserDao;
import com.it355.draganmitic.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    private UserDao userDao;
    
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String user(ModelMap map) {
        map.addAttribute("user", new User());
        userDao.addUser();
        return "user";
    }
    
}
