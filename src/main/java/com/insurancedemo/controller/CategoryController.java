package com.insurancedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurancedemo.dto.ApiResponseDto;
import com.insurancedemo.model.Category;
import com.insurancedemo.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("")
	public ResponseEntity<Category> addCategory(@RequestBody Category category) {
		
		Category newCategory = categoryService.saveCategory(category);
		return ResponseEntity.status(HttpStatus.CREATED).body(newCategory);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Category> changeCategory(@RequestBody Category category, @PathVariable("id") Long id) {
		
		Category updatedCategory = categoryService.updateCategory(category, id);
		return ResponseEntity.status(HttpStatus.OK).body(updatedCategory);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponseDto> removeCategory(@PathVariable("id") Long id) {
		
		categoryService.deleteCategory(id);
		return ResponseEntity.status(HttpStatus.OK).body(new ApiResponseDto("Category deleted successfully.", HttpStatus.OK));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable("id") Long id) {
		
		Category returnCategory = categoryService.fetchCategory(id);
		return ResponseEntity.status(HttpStatus.OK).body(returnCategory);
	}
	
	@GetMapping("")
	public ResponseEntity<List<Category>> getAllCategories(@RequestParam(defaultValue = "1", name = "page") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
		
		pageNo = (pageNo > 0) ? pageNo - 1 : 0;
		List<Category> categories = categoryService.fetchAllCategory(pageNo, pageSize);
		return ResponseEntity.status(HttpStatus.OK).body(categories);
	}
}
