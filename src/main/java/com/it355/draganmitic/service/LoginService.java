package com.it355.draganmitic.service;

import org.springframework.stereotype.Service;

@Service ("loginService")
public class LoginService {

    public String validateUser(LoginBean loginBean) {
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();
        
        if (userName.equals("user") && password.equals("user")) {
            return "true";
        } else {
            return "false";
        }
    }
}