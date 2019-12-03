package com.training.service;

import java.util.List;

import com.training.beans.Address;
import com.training.beans.MyUser;
import com.training.dao.UserDao;
import com.training.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao udao;
    
	public UserServiceImpl() {
		super();
		this.udao = new UserDaoImpl();
	}

	
	public boolean addUser(List<MyUser> arr) {
		return udao.addAllUsers(arr);
		
	}


	@Override
	public void addAddress(Address ob) {
		udao.addAddress(ob);
		
	}


	@Override
	public MyUser getUserById(String id) {
		return udao.getUserById(id);
		
	}

}
