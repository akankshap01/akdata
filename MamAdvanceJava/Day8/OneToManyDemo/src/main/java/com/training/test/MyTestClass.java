package com.training.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.beans.Address;
import com.training.beans.MyUser;

public class MyTestClass {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		Address ob=new Address();
		ob.setAid(12);
		ob.setStreet("Baner");
		ob.setCity("pune");
		Address ob1=new Address();
		ob1.setAid(13);
		ob1.setStreet("Aundh");
		ob1.setCity("pune");
		
		MyUser u=new MyUser();
		u.setId(1);
		u.setEmail("xxxx");
		u.setName("aaaa");
		u.setMobile("1111");
		Set<Address> sa=new HashSet<Address>();
		sa.add(ob);
		sa.add(ob1);
		u.setAddr(sa);
		ob.setU(u);
		ob1.setU(u);
		s.save(ob);
		s.save(ob1);
		tr.commit();
		s.close();
		sf.close();

	}

}
