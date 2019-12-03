package com.training.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.beans.Product;
import com.training.service.ProductService;




@Controller
//@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	//@RequestMapping("/products")
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView getAllProduct() {
		List<Product> plist=productService.getAllProduct();
		return new ModelAndView("displayProduct","plist",plist); 
			
		
	}
	
	@RequestMapping(value="/addProduct", method=RequestMethod.GET)
	public ModelAndView showAddform() {
		return new ModelAndView("productform","command",new Product());
		
	}
	
	@RequestMapping(value="/addData", method=RequestMethod.GET)
	public ModelAndView addProduct(@RequestParam("id") int id,@RequestParam("nm") String name,@RequestParam("qty") int qty,
			@RequestParam @DateTimeFormat(pattern="dd/MM/yyyy") Date dt) throws ParseException {
		  Product p=new Product(id,name,qty,dt);
		  productService.addProduct(p);
		  return new ModelAndView("redirect:/products");
		
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView showEditForm(@PathVariable("id") int id) {
		Product p=productService.getById(id);
		return new ModelAndView("editform","p",p);
		
	}
	
	@RequestMapping(value="updateproduct", method=RequestMethod.GET)
	public ModelAndView updateProduct(@RequestParam("id") int id,@RequestParam("nm") String name,@RequestParam("qty") int qty,
			@RequestParam @DateTimeFormat(pattern="dd/MM/yyyy") Date dt) throws ParseException {
		 Product p=new Product(id,name,qty,dt);
		productService.updateProduct(p);
		return new ModelAndView("redirect:/products");
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteProduct(@PathVariable("id") int id) {
		productService.deleteProductById(id);
		return new ModelAndView("redirect:/products");
		
	}

}
