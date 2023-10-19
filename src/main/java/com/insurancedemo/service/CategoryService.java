package com.insurancedemo.service;

import java.util.List;

import com.insurancedemo.model.Category;

public interface CategoryService {

	public Category saveCategory(Category category);
	
	public Category updateCategory(Category category, Long id);
	
	public void deleteCategory(Long id);
	
	public Category fetchCategory(Long id);
	
	public List<Category> fetchAllCategory(int pageNo, int pageSize);
}
