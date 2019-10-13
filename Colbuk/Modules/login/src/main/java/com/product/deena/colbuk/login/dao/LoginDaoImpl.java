package com.product.deena.colbuk.login.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.product.deena.colbuk.login.entity.UserDetail;
import com.product.deena.colbuk.login.utility.GenericDaoImpl;

@Repository
public class LoginDaoImpl extends GenericDaoImpl<UserDetail> implements LoginDao {
 
	public List<UserDetail> getAllUsers() {		
		return super.findByNamedQuery("findAllUsers");
	}
 
	public UserDetail getUserById(int id) {
		return null;
	}
 
	public UserDetail addUser(UserDetail newUser) {
		return super.create(newUser);
	}
 
	public UserDetail updateUser(UserDetail user) {
		return null;
	}

	public UserDetail getUserById(long id) {
		return null;
	}

	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		
	}

}
