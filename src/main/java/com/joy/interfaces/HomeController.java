package com.joy.interfaces;

import com.joy.repository.User;
import com.joy.services.application.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!";
	}

	@GetMapping("/users/all")
	public List<User> getUserAll() {
		List<User> userAll = userService.getUserAll();
		return userAll;
	}

	@RequestMapping("/user/save")
	public void save() {
		userService.save("joy", "potg");
	}
}
