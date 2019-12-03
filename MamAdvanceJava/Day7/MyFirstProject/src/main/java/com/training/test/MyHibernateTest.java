package com.training.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.beans.MyUser;
import com.training.service.UserService;
import com.training.service.UserServiceImpl;

public class MyHibernateTest {
	public static void main(String[] args) {
		MyUser ob=new MyUser(12,"Kishori","1111","aaa@gmail.com");
		MyUser ob1=new MyUser(13,"Rajan","2222","bbb@gmail.com");
		UserService us=new UserServiceImpl();
		List<MyUser> arr=new ArrayList<>();
		arr.add(ob);
		arr.add(ob1);
		boolean ans=us.addUser(arr);
		if(ans) {
			System.out.println("User added Successfully");
			
		}
		else {
			System.out.println("Error occured");
		}
		
		
		
	}

}
