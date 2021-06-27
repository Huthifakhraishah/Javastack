package com.axsos.ProductsandCategories.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProductsandCategories.models.Category;
import com.axsos.ProductsandCategories.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	 List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);	
}
