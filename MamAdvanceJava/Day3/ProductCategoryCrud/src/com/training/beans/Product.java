package com.training.beans;

public class Product {
      private int pid,qty;
      private String pname;
	public Product(int pid,  String pname,int qty) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", qty=" + qty + ", pname=" + pname + "]";
	}
	
      
}
