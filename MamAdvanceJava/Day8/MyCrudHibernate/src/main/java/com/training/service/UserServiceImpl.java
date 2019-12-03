package com.training.service;

import java.util.List;
import java.util.Scanner;

import com.training.beans.MyUser;
import com.training.dao.UserDao;
import com.training.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	private UserDao udao;
	
	public UserServiceImpl() {
		super();
		this.udao = new UserDaoImpl();
	}

	public List<MyUser> readAll() {
		
		return udao.readAll();
	}

	public void addUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		System.out.println("Enter Name: ");
		String nm=sc.next();
		System.out.println("Enter Email: ");
		String email=sc.next();
		System.out.println("Enter mobile no.: ");
		String mobile=sc.next();
		MyUser u=new MyUser(id,nm,mobile,email);
		udao.addUser(u);
	}

	public MyUser readById(int id) {
		return udao.readById(id);
		
	}

	public void deleteById(int id) {
		udao.deleteById(id);
		
	}

	public void updateById(int id) {
		udao.updateById(id);
		
	}

}
