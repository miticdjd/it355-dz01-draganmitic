package com.it355.draganmitic.dao;

import com.it355.draganmitic.model.User;
import java.util.List;

/**
 * User DAO
 */
public interface UserDao {
    public List<User> getAllUsers();
    public User getUser(Integer id);
    public boolean addUser(User user);
    public boolean updateUser(User user);
    public boolean removeUser(Integer id);
}
