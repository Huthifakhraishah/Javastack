package com.axsos.ProductsandCategories.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.ProductsandCategories.models.Category;
import com.axsos.ProductsandCategories.models.Product;
import com.axsos.ProductsandCategories.services.StroeServices;

@Controller
public class StoreController {
private final StroeServices stroeServices;
	public StoreController(StroeServices stroeServices) {
		this.stroeServices=stroeServices;
	}
	@RequestMapping("/product/new")
	public String newProduct(Model model) {
		return "newproduct.jsp";
	}
	@RequestMapping(value="/product/new", method=RequestMethod.POST)
	public String creatProduct(@Valid@ModelAttribute(value="name") String name,@ModelAttribute(value="description") String description
			,@ModelAttribute(value="price") Double price, Model model) {
		Product product = stroeServices.creatProduct(name,description,price );
		model.addAttribute("product", product);
		return "redirect:/product/"+product.getId();
	}
	@RequestMapping("/category/new")
	public String newCategory(Model model) {
		return "newcategory.jsp";
	}
	@RequestMapping(value="/category/new", method=RequestMethod.POST)
	public String creatCategory(@Valid@ModelAttribute(value="name") String name, Model model) {
		Category category = stroeServices.creatCategory(name);
		model.addAttribute("category", category);
		return "redirect:/category/"+category.getId();
	}
	@RequestMapping("/product/{id}")
	public String showProduct(@PathVariable Long id, Model model) {
		Product product = stroeServices.findProduct(id);
		List<Category> category=stroeServices.allcatEx(product);
		model.addAttribute("product", product);
		model.addAttribute("category", category);
		
		return "addproduct.jsp";
	}
	@RequestMapping("/category/{id}")
	public String addCategory(@PathVariable Long id, Model model) {
		Category category = stroeServices.findCategory(id);
		List<Product> product=stroeServices.allproEx(category);
		model.addAttribute("category", category);
		model.addAttribute("product", product);
		return "addcategory.jsp";
	}
	@RequestMapping(value="/product/{id}", method=RequestMethod.POST)
	public String updateProduct(@RequestParam(value="category")Long category_id,@PathVariable Long id  ) {
		stroeServices.createC(id,category_id);
		return "redirect:/product/"+id;
		}
	@RequestMapping(value="/category/{id}", method=RequestMethod.POST)
	public String updateCategory(@RequestParam(value="product")Long  product_id ,@PathVariable Long id ) {
		stroeServices.createP(id,product_id);
		return "redirect:/category/"+id;
		}
	}