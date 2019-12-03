package com.training.dao;

import java.util.List;

import com.training.beans.Address;
import com.training.beans.MyUser;

public interface UserDao {
	boolean addAllUsers(List<MyUser> arr);

	void addAddress(Address ob);

}
