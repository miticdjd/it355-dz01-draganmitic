package com.it355.draganmitic.dao.impl;

import com.it355.draganmitic.dao.UserDao;
import com.it355.draganmitic.mapper.UserMapper;
import com.it355.draganmitic.model.User;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * User DAO implementation
 */
public class UserDaoImpl implements UserDao {
 
    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users";
        List<User> users = jdbcTemplate.query(sql, new UserMapper());
        return users;
    }

    @Override
    public User getUser(Integer id) {
        String sql = "SELECT * FROM users WHERE user_id = " + id;
        User user = jdbcTemplate.queryForObject(sql, new UserMapper());
        return user;
    }

    @Override
    public boolean addUser(User user) {
        String sql = "INSERT INTO users (firstname, lastname, email) VALUES (?,?,?)";
        jdbcTemplate.update(sql, new Object[]{user.getFirstname(), user.getLastname(), user.getEmail()});
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        String sql = "UPDATE users SET firstname = ?, lastname = ?, email = ? WHERE user_id = ?";
        jdbcTemplate.update(sql, new Object[]{user.getFirstname(), user.getLastname(), user.getEmail(), user.getId()});
        return true;
    }

    @Override
    public boolean removeUser(Integer id) {
        String sql = "DELETE FROM users WHERE user_id = " + id;
        jdbcTemplate.execute(sql);
        return true;
    }
    
}
