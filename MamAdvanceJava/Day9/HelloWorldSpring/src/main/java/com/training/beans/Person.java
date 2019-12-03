package com.training.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware,ApplicationContextAware,BeanFactoryAware,InitializingBean,DisposableBean {
	private int id;
	private String name;
	private String mobile;
	Address addr;
	
	public Person(int id, String name, String mobile, Address addr) {
		super();
		System.out.println("in person parametrised constructor");
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Person() {
		super();
		System.out.println("in person default");
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("in set id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("in set name");
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		System.out.println("in set mobile");
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + ", addr=" + addr + "]";
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("In Set bean Name");
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("In Set bean Factory");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set");
		
	}
	
	public void myInit() {
		System.out.println("In custom init myinint");
	}
	public void myDestroy() {
		System.out.println("In custom destroy mydestroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("In disposable mydestroy");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("In set ApplicationContext");
		
	}
	

	
	

}
