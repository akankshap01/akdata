package com.training.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="emptab11")
public class Employee {
	@Id
	private int id;
	private String name;
	private String mobile;
	@ManyToMany(cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinTable(name="emp-proj",joinColumns= {@JoinColumn(name="id")},
	inverseJoinColumns= {@JoinColumn(name="pid")}
	)
	private Set<Project> sproj=new HashSet<>();
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String mobile, Set<Project> sproj) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.sproj = sproj;
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

	public Set<Project> getSproj() {
		return sproj;
	}

	public void setSproj(Set<Project> sproj) {
		this.sproj = sproj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", sproj=" + sproj + "]";
	}
	

}
