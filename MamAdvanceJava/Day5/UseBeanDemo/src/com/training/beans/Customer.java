package com.training.beans;

public class Customer {
   private int cid;
   private String cname;
   private String mobile;
   
public Customer() {
	super();
	System.out.println("in customer Deafult Constructor");
}

public Customer(int cid, String cname, String mobile) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.mobile = mobile;
	System.out.println("in customer parametrised Constructor");
}

public int getCid() {
	System.out.println("In get cid");
	return cid;
}

public void setCid(int cid) {
	System.out.println("In set CID");
	this.cid = cid;
}

public String getCname() {
	System.out.println("In get cname");
	return cname;
}

public void setCname(String cname) {
	System.out.println("In set cname");
	this.cname = cname;
}

public String getMobile() {
	System.out.println("In get mobile");
	return mobile;
}

public void setMobile(String mobile) {
	System.out.println("In set mobile");
	this.mobile = mobile;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", mobile=" + mobile + "]";
}

  
}
