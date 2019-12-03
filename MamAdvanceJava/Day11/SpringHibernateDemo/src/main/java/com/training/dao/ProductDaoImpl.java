package com.training.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.beans.Product;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
	SessionFactory sessionFactory;
	public List<Product> getAllProduct() {
		Session s=sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		Query q=s.createQuery("from Product");
		List<Product> plist=q.getResultList();
		tr.commit();
		s.close();
		return plist;
	}

	public int addProduct(Product p) {
		//Session s=sessionFactory.getCurrentSession()
		Session s=sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
		s.save(p);
		tr.commit();
		s.close();
		return 0;
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateProduct(int id, String nm, int qty) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteProductById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
