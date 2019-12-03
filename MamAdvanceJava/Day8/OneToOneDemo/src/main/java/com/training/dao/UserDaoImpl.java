package com.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.beans.Address;
import com.training.beans.MyUser;

public class UserDaoImpl implements UserDao {
    static SessionFactory sf=null;
    static {
    	sf=HibernateUtil.getMySessionFactory();
    }
	
	public boolean addAllUsers(List<MyUser> arr) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		for(MyUser u :arr) {
			s.save(u);
		}
		tr.commit();
		s.close();
		return true;
		
	}

	@Override
	public void addAddress(Address ob) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.save(ob);
		tr.commit();
		s.close();
		
	}

	@Override
	public MyUser getUserById(String id) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		MyUser u=s.load(MyUser.class,new Integer(id));
		tr.commit();
		//s.close();
		return u;

}
}
