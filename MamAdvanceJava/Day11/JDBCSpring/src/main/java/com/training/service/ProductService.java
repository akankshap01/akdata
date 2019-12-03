package com.training.service;

import java.text.ParseException;
import java.util.List;

import com.training.beans.Product;

public interface ProductService {
	

	List<Product> getAllProduct();

	int addProduct() throws ParseException;

	Product getById(int id);

	int updateProduct(int id, String nm, int qty);

	int deleteProductById(int id);
}
