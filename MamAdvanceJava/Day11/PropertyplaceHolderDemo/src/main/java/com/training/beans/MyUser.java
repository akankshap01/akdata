package com.training.beans;

public class MyUser {
	private String name,address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MyUSer [name=" + name + ", address=" + address + "]";
	}
	

}
