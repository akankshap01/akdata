package com.training.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.beans.Employee;
import com.training.beans.Project;

public class MyTestClass {

	public static void main(String[] args) {
		 SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session s=sf.openSession();
			Transaction tr=s.beginTransaction();
			Employee e1=new Employee();
			e1.setId(123);
			e1.setName("Kishori");
			e1.setMobile("111");
			Employee e2=new Employee();
			e2.setId(122);
			e2.setName("Rajan");
			e2.setMobile("222");
			Project p1=new Project();
			p1.setPid(100);
			p1.setName("Insuurance");
			p1.setDuration(10);
			Project p2=new Project();
			p2.setPid(101);
			p2.setName("Banking");
			p2.setDuration(30);
			Project p3=new Project();
			p3.setPid(102);
			p3.setName("Electronics");
			p3.setDuration(20);
			Set<Project> ps=new HashSet<Project>();
			ps.add(p1);
			ps.add(p2);
			e1.setSproj(ps);
			Set<Project> ps1=new HashSet<Project>();
			ps1.add(p3);
			ps1.add(p2);
			e2.setSproj(ps1);
			
			s.save(e1);
			s.save(e2);
			tr.commit();
			s.close();
			Session s1=sf.openSession();
			Transaction tr1=s1.beginTransaction();
			Employee e=(Employee)s1.get(Employee.class, new Integer(123));
			System.out.println("Name: "+e.getName());
			System.out.println("Projects");
			System.out.println(e.getSproj());
			tr1.commit();
			s1.close();
			sf.close();
			

	}

}
