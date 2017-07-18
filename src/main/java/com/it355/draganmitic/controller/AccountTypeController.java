package com.it355.draganmitic.controller;

import com.it355.draganmitic.model.AccountType;
import com.it355.draganmitic.service.AccountTypeService;
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
@RequestMapping("/account/types")
public class AccountTypeController {
    
    @Autowired
    private AccountTypeService accountTypeService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView accountTypes(ModelAndView modelAndView) {
        List<AccountType> accountTypes = accountTypeService.getAllAccountTypes();
        modelAndView.addObject("accountTypes", accountTypes);
        modelAndView.setViewName("account/types/list");
        return modelAndView;
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addAccountType(Model model) {
        model.addAttribute("accountType", new AccountType());
        return "account/types/add";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addAccountType(@ModelAttribute("accountType") AccountType ac, ModelAndView model)
    {
        accountTypeService.addAccountType(ac);
        model.setViewName("redirect:/account/types/");
               
        return model;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editAccountType(@PathVariable(value="id") Integer id, Model model) {
        AccountType accountType = accountTypeService.getAccountType(id);
        model.addAttribute("accountType", accountType);
        
        return "account/types/edit";
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView editAccountType(@ModelAttribute("accountType") AccountType ac, @PathVariable(value="id") Integer id, ModelAndView model)
    {
        accountTypeService.updateAccountType(ac);
        model.addObject("object", ac);
        model.setViewName("account/types/edit");
        
        return model;
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView removeAccountType(@PathVariable(value="id") Integer id, ModelAndView model)
    {
        accountTypeService.removeAccountType(id);
        model.setViewName("redirect:/account/types/");
        
        return model;
    }
    
}
