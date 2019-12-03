package com.training.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class MyUser {
	@Value("123")
	private int id;
	@Value("Kishori")
	private String name;
	
	@Autowired
	//@Qualifier("addr")
	Address address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	@PostConstruct
	public void myinit() {
		System.out.println("in myinit");
	}
	@PreDestroy
	public void mydestroy() {
		System.out.println("in destroy");
	}
}
