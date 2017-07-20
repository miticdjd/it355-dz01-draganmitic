package com.it355.draganmitic.service;

import com.it355.draganmitic.model.Category;
import java.util.List;

/**
 * CategoryService
 */
public interface CategoryService {
    public List<Category> getAllCategories();
    public Category getCategory(Integer id);
    public boolean addCategory(Category category);
    public boolean updateCategory(Category category);
    public boolean removeCategory(Integer id);
}
