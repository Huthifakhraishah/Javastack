package com.axsos.ProductsandCategories.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProductsandCategories.models.Category;
import com.axsos.ProductsandCategories.models.Product;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}
