package com.training.test;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class TestResourceBundle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter Address");
		String addr=sc.next();
		System.out.println("1.India");
		System.out.println("2. US");
		System.out.println("select Language");
		int choice=sc.nextInt();
		Locale l=null;
		switch(choice) {
		case 1:
			 l=new Locale("in","In");
			break;
		case 2:
			 l=new Locale("en","US");
			break;
		}
				
		ResourceBundle bundle=ResourceBundle.getBundle("Messages", l);
		System.out.println(bundle.getString("welcome.dis")+name);
		System.out.println(bundle.getString("name.dis")+" : "+name);
		System.out.println(bundle.getString("address.dis")+" : "+addr);
	}

}
