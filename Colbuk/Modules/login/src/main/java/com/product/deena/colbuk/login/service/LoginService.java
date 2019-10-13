package com.product.deena.colbuk.login.service;


import java.util.List;

import com.product.deena.colbuk.login.dto.UserDetailDto;
 
public interface LoginService {
 
	public List<UserDetailDto> getAllUsers();
 
	public UserDetailDto getUserById(int id);
 
	public String addUser(UserDetailDto newUser);
 
	public String updateUser(UserDetailDto updateUser);
 
	public void deleteUser(int id);
}