package com.training.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.training.beans.HelloWorld;
import com.training.beans.Person;
public class TestMyHelloWorld {

	public static void main(String[] args) {
		//XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("Hello.xml"));
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Hello.xml");
		System.out.println("Factory created");
		HelloWorld hw=(HelloWorld)ctx.getBean("hwbean");
		System.out.println(hw.sayHello());
		HelloWorld hw1=(HelloWorld)ctx.getBean("hwbean");
		Person p=(Person)ctx.getBean("p1");
		System.out.println(p);
		Person p1=(Person)ctx.getBean("p2");
		System.out.println(p1);
		Person p2=(Person)ctx.getBean("p3");
		System.out.println(p2);
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
