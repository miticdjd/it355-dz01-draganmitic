package com.it355.draganmitic.service;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.springframework.stereotype.Service;

@Service ("addAccountService")
public class AddAccountService {

    public String validateAccount(AddAccountBean addAccountBean) {
        String type = addAccountBean.getType();
        String account = addAccountBean.getAccount();
        
        if (type.equals("paypal") && this.isValidEmailAddress(account)) {
            return "true";
        } else if (type.equals("bank") && this.isValidBankAccount(account)) {
            return "true";
        } else {
            return "false";
        }
    }
    
    public boolean isValidEmailAddress(String email) {
        boolean result = true;
        
        try {
           InternetAddress emailAddr = new InternetAddress(email);
           emailAddr.validate();
        } catch (AddressException ex) {
           result = false;
        }
        
        return result;
    }
    
    public boolean isValidBankAccount(String number) {
        return number.matches("[0-9-]+");
    }
}