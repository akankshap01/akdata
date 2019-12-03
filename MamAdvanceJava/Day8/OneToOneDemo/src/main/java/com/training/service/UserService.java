package com.training.service;

import java.util.List;

import com.training.beans.Address;
import com.training.beans.MyUser;

public interface UserService {
	boolean addUser(List<MyUser> arr);

	void addAddress(Address ob);

	MyUser getUserById(String id);

}
