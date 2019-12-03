package com.training.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.training.dao.*;

import com.training.beans.MyUser;

public class UserDaoImpl implements UserDao {
	static SessionFactory sf=null;
	static {
		sf=HibernateUtil.getMySessionFactory();
	}
	public List<MyUser> readAll() {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		String sql="from MyUser";
		Query q=s.createQuery(sql);
		List<MyUser> u=q.list();
		tr.commit();
		s.close();
		return u;
	}
	public void addUser(MyUser u) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.save(u);
		tr.commit();
		s.close();
	}
	public MyUser readById(int id) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		MyUser u=(MyUser) s.get(MyUser.class, new Integer(id));
		tr.commit();
		s.close();
		return u;
	}
	public void deleteById(int id) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		MyUser u=(MyUser)s.get(MyUser.class, new Integer(id));
		s.delete(u);
		tr.commit();
		s.close();
	}
	public void updateById(int id) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		MyUser u=(MyUser) s.get(MyUser.class, new Integer(id));
		u.setMobile("777");
		s.update(u);
		tr.commit();
		s.close();
	}

}
