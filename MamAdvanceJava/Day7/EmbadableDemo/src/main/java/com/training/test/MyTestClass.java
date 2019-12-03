package com.training.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.beans.Address;
import com.training.beans.MyUser;
import com.training.service.UserService;
import com.training.service.UserServiceImpl;

public class MyTestClass {

	public static void main(String[] args) {
		MyUser u=new MyUser();
		u.setId("12");
		u.setEmail("ajsh@gmail.com");
		u.setMobile("1111");
		u.setName("Kishori");
		Address ob=new Address(123,"Baner","Pune");
		u.setAddr(ob);
		
		MyUser u1=new MyUser();
		u1.setId("13");
		u1.setEmail("bbbbb@gmail.com");
		u1.setMobile("22222");
		u1.setName("Revati");
		u1.setAddr(ob);
		
		List<MyUser> ulist=new ArrayList<>();
		ulist.add(u1);
		ulist.add(u);
		UserService us=new UserServiceImpl();
		
        us.addUser(ulist);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Id to search");
		String id=sc.next();
		MyUser ob1=us.getUserById(id);
		System.out.println(ob1);
		
		
		
		

	}

}
