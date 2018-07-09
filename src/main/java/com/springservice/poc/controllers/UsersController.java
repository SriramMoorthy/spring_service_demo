package com.springservice.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springservice.poc.jpa.UserRepository;
import com.springservice.poc.model.Users;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserRepository userJpaRepository;
	
	@GetMapping(value="/all")
	public List<Users> findAll(){
		return userJpaRepository.findAll();
	}
	
	@GetMapping(value="/{name}")
	private Users findByName(@PathVariable final String name) {
		return userJpaRepository.findByName(name);
	}

	@PostMapping(value="/load")
	private Users load(@RequestBody Users user) {
		userJpaRepository.save(user);
		return userJpaRepository.findByName(user.getName());
	}
}
