package com.example.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Category;
import com.example.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
