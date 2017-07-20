package com.it355.draganmitic.dao.impl;

import com.it355.draganmitic.dao.CategoryDao;
import com.it355.draganmitic.mapper.CategoryMapper;
import com.it355.draganmitic.model.Category;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Category DAO implementation
 */
public class CategoryDaoImpl implements CategoryDao {
 
    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Category> getAllCategories() {
        String sql = "SELECT * FROM category";
        List<Category> categories = jdbcTemplate.query(sql, new CategoryMapper());
        return categories;
    }

    @Override
    public Category getCategory(Integer id) {
        String sql = "SELECT * FROM category WHERE category_id = " + id;
        Category category = jdbcTemplate.queryForObject(sql, new CategoryMapper());
        return category;
    }

    @Override
    public boolean addCategory(Category category) {
        String sql = "INSERT INTO category (name) VALUES (?)";
        jdbcTemplate.update(sql, new Object[]{category.getName()});
        return true;
    }

    @Override
    public boolean updateCategory(Category category) {
        String sql = "UPDATE category SET name = ? WHERE category_id = ?";
        jdbcTemplate.update(sql, new Object[]{category.getName(), category.getId()});
        return true;
    }

    @Override
    public boolean removeCategory(Integer id) {
        String sql = "DELETE FROM category WHERE category_id = " + id;
        jdbcTemplate.execute(sql);
        return true;
    }
    
}
