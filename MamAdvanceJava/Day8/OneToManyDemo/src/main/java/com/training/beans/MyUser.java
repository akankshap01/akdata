package com.training.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name="MyUserTab11")
public class MyUser {
	@Id
	private int id;
	@Column(name="uname",nullable=false)
	private String name;
	private String mobile;
	private String email;
	@OneToMany(mappedBy="u",cascade= {CascadeType.ALL})
	Set<Address> addr=new HashSet<Address>();
	
	public MyUser() {
		super();
	}

	public MyUser(int id, String name, String mobile, String email, Set<Address> addr) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.addr = addr;
	}

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

	public Set<Address> getAddr() {
		return addr;
	}

	public void setAddr(Set<Address> addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", addr=" + addr
				+ "]";
	}
	
	
	
}
