package com.training.beans;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="AddressTab")
public class Address {
	@Id
	private int aid;
	private String street;
	private String city;
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="id")
	MyUser u;
	
	public Address() {
		super();
	}

	public Address(int aid, String street, String city, MyUser u) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.u = u;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public MyUser getU() {
		return u;
	}

	public void setU(MyUser u) {
		this.u = u;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", u=" + u + "]";
	}
	
	

	

}
