package com.training.dao;

import java.util.List;

import com.training.beans.MyUser;

public interface UserDao {

	List<MyUser> readAll();

	void addUser(MyUser u);

	MyUser readById(int id);

	void deleteById(int id);

	void updateById(int id);

}
