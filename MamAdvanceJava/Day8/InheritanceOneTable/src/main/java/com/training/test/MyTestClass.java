package com.training.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.beans.ContractEmp;
import com.training.beans.SalariedEmp;

public class MyTestClass {
  public static void main(String[] args) {
	  SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		SalariedEmp s1=new SalariedEmp(111,"xxx", "HR", 2345.45, 555.00);
		ContractEmp c1=new ContractEmp(122,"yyy", "purchase", 2348.45, 777.00);
		s.save(s1);
		s.save(c1);
		tr.commit();
		s.close();
		sf.close();
		
  }
}
