package com.it355.draganmitic.model;

import java.io.Serializable;

/**
 * User model
 */
@SuppressWarnings("serial")
public class User implements Serializable {
    
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "User [id=" + this.id + ", firstname=" + this.firstname + ", lastname=" + this.lastname + "]";
    }
    
}
