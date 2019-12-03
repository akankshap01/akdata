package com.training.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.Product;
import com.training.dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;
	public List<Product> getAllProduct(){
		return productDao.getAllProduct();
	}
	public int addProduct() throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter Quntity:");
		int qty=sc.nextInt();
		System.out.println("Enter Date:");
		String date=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dt=sdf.parse(date);
		Product p=new Product(id,name,qty,dt);
		return productDao.addProduct(p);
		
	}

	public Product getById(int id) {
		return productDao.getProductById(id);
	}
	@Override
	public int updateProduct(int id, String nm, int qty) {
		return productDao.updateProduct(id,nm,qty);
		
	}
	@Override
	public int deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}
}
