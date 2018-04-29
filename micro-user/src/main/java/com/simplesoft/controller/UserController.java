package com.simplesoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplesoft.bean.User;
import com.simplesoft.reponsitory.UserResponsitory;

@RestController
public class UserController {
	@Autowired
	private UserResponsitory userRepository;
	
	@RequestMapping("/byId/{id}")
	public User userById(@PathVariable Long id) {
		return this.userRepository.findOne(id);
	}
	
}
