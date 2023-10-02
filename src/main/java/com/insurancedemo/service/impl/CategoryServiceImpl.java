package com.insurancedemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurancedemo.model.Category;
import com.insurancedemo.repository.CategoryRepository;
import com.insurancedemo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category saveCategory(Category category) {
		Category newCategory = categoryRepository.save(category);
		return newCategory;
	}

	@Override
	public Category updateCategory(Category category, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category fetchCategory(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> fetchAllCategory(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
