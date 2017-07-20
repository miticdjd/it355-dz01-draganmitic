package com.it355.draganmitic.model;

import java.io.Serializable;

/**
 * Category model
 */
@SuppressWarnings("serial")
public class Category implements Serializable {
    
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
    
    @Override
    public String toString() {
        return "User [id=" + this.id + ", name=" + this.name + "]";
    }
    
}
