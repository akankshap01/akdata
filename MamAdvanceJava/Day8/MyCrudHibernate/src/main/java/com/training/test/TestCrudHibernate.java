package com.training.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.beans.MyUser;
import com.training.service.UserService;
import com.training.service.UserServiceImpl;

public class TestCrudHibernate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		UserService us=new UserServiceImpl();
		do {
		System.out.println("1.Add"+"\n2.delete"+"\n3.Update"+"\n4.Read All"+"\n5.Read By Id"+"\n6.Exit");
		System.out.println("Enter choice:");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			us.addUser();
			break;
		
		case 2:
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			us.deleteById(id);
			break;
			
		case 3:
			System.out.println("Enter Id: ");
			id=sc.nextInt();
			us.updateById(id);
			break;
			
		case 4:
			List<MyUser> uList=us.readAll();
			//uList.stream().forEach(s->{System.out.println(s);});
			for(MyUser u:uList) {
				System.out.println(u);
			}
			break;
			
		case 5:
			System.out.println("Enter Id: ");
			 id=sc.nextInt();
			MyUser u=us.readById(id);
			System.out.println(u);
			break;
			
		case 6:
			sc.close();
			System.exit(0);
			break;
		}
		}while(choice!=6);

	}

}
