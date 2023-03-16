package com.ogurek.helloplant.services;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogurek.helloplant.entities.User;
import com.ogurek.helloplant.repositories.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User create(User user) {
		return userRepository.save(user);
	}
	
//	@Override
//	public User createUser(User user) {
//		return userRepository.saveUser(user);
//	}

	@Override
	public Optional<User> getById(int id) {
		return userRepository.findById(Integer.valueOf(id));
	}
}
