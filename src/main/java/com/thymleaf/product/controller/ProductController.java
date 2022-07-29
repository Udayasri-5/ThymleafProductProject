package com.thymleaf.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thymleaf.product.entity.Product;
import com.thymleaf.product.entity.ProductCategory;
import com.thymleaf.product.service.CategoryService;
import com.thymleaf.product.service.ProductService;


@Controller
@RequestMapping("/productview")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryservice;
	
	@GetMapping("/productList")
	public String display(Model model) {
		List<Product> p = productService.findAll();
		model.addAttribute("product", p);
		return "ProductUI/productlist.html";
		
	}
	
	@GetMapping("/category")
	public String displayC(Model model) {
		List<ProductCategory> C = categoryservice.findAll();
		model.addAttribute("category", C);
		return "ProductUI/category.html";
		
	}
	
	
	
	@GetMapping("/addProduct")
	public String empForm(Model model) {
		model.addAttribute("product",new Product());
		return "ProductUI/productform.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("product") Product product) {
		
		productService.save(product);
		
		return "redirect:/productview/productList";
	}
	
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("productId") Integer id, Model model) {
		Product p = productService.findById(id);
		model.addAttribute("product",p);
		return "ProductUL/productform.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("productId") Integer id) {
		productService.deleteById(id);
		
		return "redirect:/productview/productList";
	}
	
	@GetMapping("/serach")
	public String searchByName(Model model,@RequestParam("productname") String productname) {
		if(productname != null) {
			List<Product> proList = productService.findByKeyword(productname);
			model.addAttribute("product",proList);
			return "ProductUI/productlist.html";
		}else {
			List<Product> proList = productService.findAll();
			model.addAttribute("product",proList);
		}
		return "ProductUI/productlist.html";
		
	}



}
