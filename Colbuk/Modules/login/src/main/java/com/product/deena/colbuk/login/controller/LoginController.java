package com.product.deena.colbuk.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.deena.colbuk.login.dto.UserDetailDto;
import com.product.deena.colbuk.login.service.LoginService;


 
@Controller
public class LoginController {
 
	@Autowired
	LoginService loginService;
 
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody String dummy() { 
		return "welcome";
	}
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public @ResponseBody List<UserDetailDto> getUsers() { 
		List<UserDetailDto> listOfUsers = loginService.getAllUsers();
		return listOfUsers;
	}
	
	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
	public @ResponseBody UserDetailDto getUserById(@PathVariable("id") int userId) { 
		return loginService.getUserById(userId);
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public @ResponseBody String addUser(@RequestBody UserDetailDto newUser) {
		return loginService.addUser(newUser);
	}
  
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public @ResponseBody String updateUser(@RequestBody UserDetailDto user) {
		return loginService.updateUser(user);
	}
 
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.PUT)
	public @ResponseBody String deleteUser(@PathVariable("id") int id) {
		loginService.deleteUser(id);
		return "Success";
 
	}	
}