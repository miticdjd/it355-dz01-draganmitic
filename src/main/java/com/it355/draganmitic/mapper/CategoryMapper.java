package com.it355.draganmitic.mapper;

import com.it355.draganmitic.model.Category;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * AccountTypeMapper
 */
public class CategoryMapper implements RowMapper<Category> {
    
    @Override
    public Category mapRow(ResultSet rs, int arg1) throws SQLException {
        Category category = new Category();
        category.setId(rs.getInt("category_id"));
        category.setName(rs.getString("name"));
        
        return category;
    }
    
}
