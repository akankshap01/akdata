package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.beans.Category;
import com.training.beans.Product;

public class CategoryDaoImpl implements CategoryDao{
    static Connection conn=null;
    static PreparedStatement cAll=null;
    static PreparedStatement pAllByCat=null;
    static{
    	conn=MyConnection.getMyConnection();
    	try {
			cAll=conn.prepareStatement("select * from Category");
			pAllByCat=conn.prepareStatement("select * from product_acts where cid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
	@Override
	public List<Category> getAllCategory() {
		try {
			ResultSet rs=cAll.executeQuery();
			List<Category> clist=new ArrayList<>();
			while(rs.next()) {
				Category c=new Category(rs.getInt(1),rs.getString(2),rs.getString(3));
				clist.add(c);
			}
			return clist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Product> getAllProductByCategory(int cid) {
		try {
			pAllByCat.setInt(1, cid);
			ResultSet rs=pAllByCat.executeQuery();
			List<Product> plist=new ArrayList<>();
			while(rs.next()) {
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3));
				plist.add(p);
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
