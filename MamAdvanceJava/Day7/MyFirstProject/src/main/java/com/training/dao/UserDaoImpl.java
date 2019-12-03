package com.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.beans.MyUser;

public class UserDaoImpl implements UserDao {
    static SessionFactory sf=null;
    static {
    	sf=HibernateUtil.getMySessionFactory();
    }
	@Override
	public boolean addAllUsers(List<MyUser> arr) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		for(MyUser u :arr) {
			s.save(u);
		}
		tr.commit();
		return true;
		
	}

}
