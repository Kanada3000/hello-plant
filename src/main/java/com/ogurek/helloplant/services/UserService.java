package com.ogurek.helloplant.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ogurek.helloplant.entities.User;

public interface UserService {
	public User create (User user);
//	public User createUser (User user);
	public Optional<User> getById (int id);
}
