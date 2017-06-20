package com.it355.draganmitic.service;

import java.io.Serializable;

public class AddAccountBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String type;
    private String account;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    @Override
    public String toString() {
        return "AddAccountBean [type=" + this.type + ", account = " + this.account + "]";
    }
}