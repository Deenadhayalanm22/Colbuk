package com.product.deena.colbuk.login.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.deena.colbuk.login.dao.LoginDao;
import com.product.deena.colbuk.login.dto.UserDetailDto;
import com.product.deena.colbuk.login.entity.UserDetail;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;
 
	@Transactional
	public List<UserDetailDto> getAllUsers() {
		List<UserDetailDto> allUsersDto = new ArrayList();
		List<UserDetail> allUsers =loginDao.getAllUsers();
		for(UserDetail user:allUsers) {
			UserDetailDto userDto = new UserDetailDto();
			BeanUtils.copyProperties(user, userDto);
			allUsersDto.add(userDto);
		}
		return allUsersDto;
	}
 
	@Transactional
	public UserDetailDto getUserById(int id) {
		UserDetail user = loginDao.getUserById(id);
		UserDetailDto userDto = new UserDetailDto();
		BeanUtils.copyProperties(user, userDto);
		return userDto;
	}
 
	@Transactional
	public String addUser(UserDetailDto newUser) {
		UserDetail user = new UserDetail();
		BeanUtils.copyProperties(newUser, user);		
		Date currentDate = new Date();
		user.setCreatedDate(currentDate);
		
		UserDetail addedUser = loginDao.addUser(user);
		if(addedUser.getId()!=null) {
			return "User added successfully!";
		}
		return "Not able to add user";
	}
 
	@Transactional
	public String updateUser(UserDetailDto updateUser) {
		UserDetail user = new UserDetail();
		BeanUtils.copyProperties(updateUser, user);		
		Date currentDate = new Date();
		user.setUpdatedDate(currentDate);
		UserDetail us = loginDao.updateUser(user);
		if(us.getUpdatedDate()!=null) {
			return "User updated successfully!";
		}
		return "Not able to update user";
	}
 
	@Transactional
	public void deleteUser(int id) {
		loginDao.deleteUser(id);
	}

}
