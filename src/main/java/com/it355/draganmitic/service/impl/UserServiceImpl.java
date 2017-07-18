package com.it355.draganmitic.service.impl;

import com.it355.draganmitic.dao.UserDao;
import com.it355.draganmitic.model.User;
import com.it355.draganmitic.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserServiceImpl
 */
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public boolean removeUser(Integer id) {
        return userDao.removeUser(id);
    }
    
}
