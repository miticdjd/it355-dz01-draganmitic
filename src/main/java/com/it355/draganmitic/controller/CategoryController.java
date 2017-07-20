package com.it355.draganmitic.controller;

import com.it355.draganmitic.model.Category;
import com.it355.draganmitic.service.CategoryService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Category>> categories() {
        List<Category> categories = categoryService.getAllCategories();
        
        if (categories.size() == 0) {
            return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);
        }
        
        return new ResponseEntity<List<Category>>(categories, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Category> categories(@PathVariable(value="id") Integer id) {
        Category category = categoryService.getCategory(id);
        
        if (category == null) {
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<Category>(category, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Category> editCategory(@RequestBody Category category, @PathVariable(value="id") Integer id) {
        category.setId(id);
        categoryService.updateCategory(category);
        
        return new ResponseEntity<Category>(category, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> removeCategory(@PathVariable(value="id") Integer id) {
        Category category = categoryService.getCategory(id);
        
        if (category == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        
        categoryService.removeCategory(id);
        
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
