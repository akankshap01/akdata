package com.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.beans.MyUser;

public class MyTestClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Myuser.xml");
        MyUser u=(MyUser)ctx.getBean("myUser");
        System.out.println(u);
	}

}
