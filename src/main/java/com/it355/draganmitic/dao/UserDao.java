package com.it355.draganmitic.dao;

/**
 * User DAO
 */
public interface UserDao {
    
    public void addUser();
    
    public String addUserRet();
    
    public void addUserThrowException() throws Exception;
    
    public void addUserAround(String name);
}
