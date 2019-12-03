package com.training.service;

import java.util.List;

import com.training.beans.MyUser;

public interface UserService {
	List<MyUser> readAll();
	void addUser();
	MyUser readById(int id);
	void deleteById(int id);
	void updateById(int id);
}

