package com.joy.services.application.impl;

import com.joy.repository.User;
import com.joy.repository.UserRepository;
import com.joy.services.application.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Transactional(readOnly = true)
	@Override
	public List<User> getUserAll() {
		return userRepository.findAll();
	}

	@Transactional
	@Override
	public void save(String name, String team) {
		User user = User.create("joy", "potg");
		userRepository.save(user);
	}
}
