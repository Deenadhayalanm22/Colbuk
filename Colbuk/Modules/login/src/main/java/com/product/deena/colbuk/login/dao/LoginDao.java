package com.product.deena.colbuk.login.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.deena.colbuk.login.entity.UserDetail;
import com.product.deena.colbuk.login.utility.GenericDao;
 
public interface LoginDao extends GenericDao<UserDetail>{
	
	public List<UserDetail> getAllUsers();
	
	public UserDetail getUserById(long id);
	
	public UserDetail addUser(UserDetail newUser);
	
	public UserDetail updateUser(UserDetail user);
	
	public void deleteUser(long id);
 
 
}