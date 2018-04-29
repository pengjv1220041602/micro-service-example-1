package com.simplesoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplesoft.bean.User;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${userAddr}")
	private String userAddr;
	
	@RequestMapping("/movie/{id}")
	public User findOne(@PathVariable Long id) {
		return this.restTemplate.getForObject(userAddr+id, User.class);
	}
}
