package com.insurancedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurancedemo.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
