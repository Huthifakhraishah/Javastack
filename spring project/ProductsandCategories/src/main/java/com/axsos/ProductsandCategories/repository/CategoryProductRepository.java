package com.axsos.ProductsandCategories.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProductsandCategories.models.CategoryProduct;
@Repository
public interface CategoryProductRepository extends CrudRepository<CategoryProduct, Long> {

}
