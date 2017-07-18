package com.it355.draganmitic.controller;

import com.it355.draganmitic.model.User;
import com.it355.draganmitic.service.UserService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView users(ModelAndView modelAndView) {
        List<User> users = userService.getAllUsers();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("users/list");
        return modelAndView;
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "users/add";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User u, ModelAndView model)
    {
        userService.addUser(u);
        model.setViewName("redirect:/users/");
               
        return model;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editUser(@PathVariable(value="id") Integer id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        
        return "users/edit";
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView editUser(@ModelAttribute("user") User u, @PathVariable(value="id") Integer id, ModelAndView model)
    {
        userService.updateUser(u);
        model.addObject("object", u);
        model.setViewName("users/edit");
        
        return model;
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView removeUser(@PathVariable(value="id") Integer id, ModelAndView model)
    {
        userService.removeUser(id);
        model.setViewName("redirect:/users/");
        
        return model;
    }
    
}
