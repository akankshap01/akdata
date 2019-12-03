package com.training.test;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.beans.Product;
import com.training.service.ProductService;



public class MyTestClass {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ApplicationContext ctx=new ClassPathXmlApplicationContext("MyProduct.xml"); 
		ProductService ps=(ProductService) ctx.getBean("productServiceImpl");
		
		do {
		System.out.println("1.Add"+"\n2.delete"+"\n3.Update"+"\n4.Read All"+"\n5.Read By Id"+"\n6.Exit");
		System.out.println("Enter choice:");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			int n=ps.addProduct();
			if(n>0) {
				System.out.println("Product Added Successfully!!!");
			}
			break;
		
		case 2:
			System.out.println("enter Id");
			int id=sc.nextInt();
			 n=ps.deleteProductById(id);
			 if(n>0) {
					System.out.println("Deleted successfully");
				}
			break;
			
		case 3:
			System.out.println("enter Id");
			id=sc.nextInt();
			Product p=ps.getById(id);
			System.out.println(p);
			System.out.println("Enter new name");
			String nm=sc.next();
			System.out.println("Enter new qty");
			int qty=sc.nextInt();
			n=ps.updateProduct(id,nm,qty);
			if(n>0) {
				System.out.println("Updated successfully");
			}
			break;
			
		case 4:
			List<Product> plist=ps.getAllProduct();
			for(Product p1:plist) {
				System.out.println(p1);
			}
			break;
			
		case 5:
			System.out.println("enter Id");
			id=sc.nextInt();
			p=ps.getById(id);
			System.out.println(p);
			break;
			
		case 6:
			sc.close();
			System.exit(0);
			break;
		}
		}while(choice!=6);
	}

}
