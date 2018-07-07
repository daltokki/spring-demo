package com.joy.services.application;

import com.joy.repository.User;

import java.util.List;


public interface UserService {
	List<User> getUserAll();

	void save(String name, String team);
}
