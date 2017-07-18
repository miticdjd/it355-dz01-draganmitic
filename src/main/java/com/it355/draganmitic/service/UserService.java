package com.it355.draganmitic.service;

import com.it355.draganmitic.model.User;
import java.util.List;

/**
 * UserService
 */
public interface UserService {
    public List<User> getAllUsers();
    public User getUser(Integer id);
    public boolean addUser(User user);
    public boolean updateUser(User user);
    public boolean removeUser(Integer id);
}
