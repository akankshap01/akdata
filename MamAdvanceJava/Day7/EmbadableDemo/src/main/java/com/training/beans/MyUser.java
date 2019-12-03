package com.training.beans;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MyUserTab")
public class MyUser {
	@Id
	private String id;
	@Column(name="uname",nullable=false)
	private String name;
	private String mobile;
	private String email;
	@Embedded
	Address addr;
	
	public MyUser() {
		super();
	}

	public MyUser(String id, String name, String mobile, String email, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", addr=" + addr
				+ "]";
	}

	
}
