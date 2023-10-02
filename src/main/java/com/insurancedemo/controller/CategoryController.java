package com.insurancedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurancedemo.model.Category;
import com.insurancedemo.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	public Category addCategory(@RequestBody Category category) {
		
		Category newCategory = categoryService.saveCategory(category);
		return newCategory;
	}
}
