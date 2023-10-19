package com.insurancedemo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.insurancedemo.exception.CategoryNotFoundException;
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

		Optional<Category> returnedOption = categoryRepository.findById(id);
		if (returnedOption.isPresent()) {
			Category returnCategory = returnedOption.get();
			returnCategory.setCategoryName(category.getCategoryName());
			returnCategory.setDescription(category.getDescription());
			return categoryRepository.save(returnCategory);
		}
		else {
			throw new CategoryNotFoundException("No Category found with id: "+id);
		}
	}

	@Override
	public void deleteCategory(Long id) {
		
		Optional<Category> returnedCategory = categoryRepository.findById(id);
		if (returnedCategory.isPresent()) {
			categoryRepository.delete(returnedCategory.get());
		}
		else {
			throw new CategoryNotFoundException("No Category found with id: "+id);
		}
	}

	@Override
	public Category fetchCategory(Long id) {
		
		Optional<Category> returnedCategory = categoryRepository.findById(id);
		if (returnedCategory.isPresent()) {
			return returnedCategory.get();
		}
		else {
			throw new CategoryNotFoundException("No Category found with id: "+id);
		}
	}

	@Override
	public List<Category> fetchAllCategory(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by("categoryName").ascending());
		Page<Category> page = categoryRepository.findAll(pageable);
		if (page.hasContent()) {
			return page.getContent();
		}
		else {
			return new ArrayList<Category>();
		}
	}

}
