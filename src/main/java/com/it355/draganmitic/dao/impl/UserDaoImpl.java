package com.it355.draganmitic.dao.impl;

import com.it355.draganmitic.dao.UserDao;

/**
 * User DAO implementation
 */
public class UserDaoImpl implements UserDao {
 
    @Override
    public void addUser() {
        System.out.println("Adding a user");
    }

    @Override
    public String addUserRet() {
        System.out.println("Adding a user and returning a value");
        return "added";
    }

    @Override
    public void addUserThrowException() throws Exception {
        System.out.println("Adding a user and throwing an exception");
        throw new Exception("Generic Error");
    }

    @Override
    public void addUserAround(String name) {
        System.out.println("Adding a user with name " + name);
    }
    
}
