package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.beans.Product;
import com.training.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView getAllProduct() {
		List<Product> plist=productService.getAllProduct();
		return new ModelAndView("displayProduct","plist",plist); 
			
		
	}
	
	@RequestMapping(value="/addProduct", method=RequestMethod.GET)
	public ModelAndView addproduct() {
		return new ModelAndView("productform","command",new Product());
		
	}

}
