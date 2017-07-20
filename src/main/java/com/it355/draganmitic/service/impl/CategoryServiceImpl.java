package com.it355.draganmitic.service.impl;

import com.it355.draganmitic.dao.CategoryDao;
import com.it355.draganmitic.model.Category;
import com.it355.draganmitic.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * AccountTypeServiceImpl
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;
    
    @Override
    public List<Category> getAllCategories() {
        return categoryDao.getAllCategories();
    }

    @Override
    public Category getCategory(Integer id) {
        return categoryDao.getCategory(id);
    }

    @Override
    public boolean addCategory(Category category) {
        return categoryDao.addCategory(category);
    }

    @Override
    public boolean updateCategory(Category category) {
        return categoryDao.updateCategory(category);
    }

    @Override
    public boolean removeCategory(Integer id) {
        return categoryDao.removeCategory(id);
    }
    
}
