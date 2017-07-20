package com.it355.draganmitic.model;

import java.io.Serializable;

/**
 * Category model
 */
@SuppressWarnings("serial")
public class Account implements Serializable {
    
    private Integer id;
    private Integer amount;
    private String number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return "User [id=" + this.id + ", amount=" + this.amount + ", number=" + this.number + "]";
    }
    
}
