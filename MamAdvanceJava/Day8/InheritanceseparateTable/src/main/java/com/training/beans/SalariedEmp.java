package com.training.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="salaryTab")
public class SalariedEmp extends Employee{
	private double sal,bonus;

	public SalariedEmp(int id, String name, String dept,double sal, double bonus) {
		super(id,name,dept);
		this.sal = sal;
		this.bonus = bonus;
	}

	public SalariedEmp() {
		super();
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	

}
