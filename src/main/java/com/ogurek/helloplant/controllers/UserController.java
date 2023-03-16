package com.ogurek.helloplant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogurek.helloplant.entities.User;
import com.ogurek.helloplant.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public User add(@RequestBody User user) {
		return userService.create(user);
	}
	
	@GetMapping("/get/{id}")
	public User get(@PathVariable int id) {
		//TO-DO if there is no user
		return userService.getById(id).orElse(null);
	}
}
