package com.training.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class ContractEmp extends Employee{
	private double nohrs,charges;

	public ContractEmp(int id, String name, String dept,double nohrs, double charges) {
		super(id,name,dept);
		this.nohrs = nohrs;
		this.charges = charges;
	}

	public ContractEmp() {
		super();
	}

	@Override
	public String toString() {
		return "ContractEmp [nohrs=" + nohrs + ", charges=" + charges + "]";
	}

}
