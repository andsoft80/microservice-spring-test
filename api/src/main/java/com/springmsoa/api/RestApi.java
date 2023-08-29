package com.springmsoa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springmsoa.api.users.UserRepository;
import com.springmsoa.api.users.User;
import java.util.List;

@RestController
public class RestApi {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("*")
	// public List<User> index() {

	// 	return userRepository.findAll();
	// }

	public String index() {

		return "Hello Andrey";
	}

}
