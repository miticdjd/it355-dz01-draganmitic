package com.it355.draganmitic.dao;

import com.it355.draganmitic.model.Category;
import java.util.List;

/**
 * Category DAO
 */
public interface CategoryDao {
    public List<Category> getAllCategories();
    public Category getCategory(Integer id);
    public boolean addCategory(Category category);
    public boolean updateCategory(Category category);
    public boolean removeCategory(Integer id);
}
