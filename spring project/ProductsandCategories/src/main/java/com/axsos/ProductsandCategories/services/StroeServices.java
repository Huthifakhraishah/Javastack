package com.axsos.ProductsandCategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.ProductsandCategories.models.Category;
import com.axsos.ProductsandCategories.models.CategoryProduct;
import com.axsos.ProductsandCategories.models.Product;
import com.axsos.ProductsandCategories.repository.CategoryProductRepository;
import com.axsos.ProductsandCategories.repository.CategoryRepository;
import com.axsos.ProductsandCategories.repository.ProductRepository;

@Service
public class StroeServices {
private final CategoryRepository categoryRepository;
private final ProductRepository productRepository;
private final CategoryProductRepository categoryProductRepository;
	public StroeServices(CategoryRepository categoryRepository,ProductRepository productRepository
			,CategoryProductRepository categoryProductRepository) {
	this.categoryRepository=categoryRepository;
	this.productRepository=productRepository;
	this.categoryProductRepository=categoryProductRepository;
	}
	public List<Product> allProduct(){
		return productRepository.findAll();
	}
	public List<Category> allCategory(){
		return categoryRepository.findAll();
	}
	public Product creatProduct(String name,String descriptoin,Double price) {
		Product product=new Product();
		product.setPrice(price);
		product.setName(name);
		product.setDescription(descriptoin);
		return productRepository.save(product);
	}
	public Category creatCategory(String name) {
		Category category=new Category();
		category.setName(name);
		return categoryRepository.save(category);
	}
	public Product findProduct(Long id) {
		   Optional<Product> findProdcut = productRepository.findById(id);
		   if(findProdcut.isPresent()) {
	        return findProdcut.get();
	    } else {
	    	return null;
	    }
	}
	public Category findCategory(Long id) {
		   Optional<Category> findCategory = categoryRepository.findById(id);
		   if(findCategory.isPresent()) {
	        return findCategory.get();
	    } else {
	    	return null;                                
	    }
	}
	public List<Category> allcatEx(Product product){
		return categoryRepository.findByProductsNotContains(product);
	}
	public List<Product> allproEx(Category category){
		return productRepository.findByCategoriesNotContains(category);
	}
	public Product createC(Long id,Long category_id) {
		Product product=productRepository.findById(id).orElse(null);
		Category category=categoryRepository.findById(category_id).orElse(null);
		List<Category> cat=product.getCategories();
		cat.add(category);
		product.setCategories(cat);
		return productRepository.save(product);
	}
	public Category createP(Long id, Long product_id) {
		Category category=categoryRepository.findById(id).orElse(null);
		Product product=productRepository.findById(product_id).orElse(null);
		List<Product> pro=category.getProducts();
		pro.add(product);
		category.setProducts(pro);
		return categoryRepository.save(category);
	}
}