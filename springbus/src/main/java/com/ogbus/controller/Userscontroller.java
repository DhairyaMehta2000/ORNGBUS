package com.ogbus.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ogbus.model.Users;
import com.ogbus.repository.UsersRepo;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="http://localhost:4200")


public class Userscontroller {
	@Autowired
	private UsersRepo usersRepo;

	// get all users
	@GetMapping("get")
	public List<Users> getAllUsers() {
		return usersRepo.findAll();
	}

	// create user rest api
	@PostMapping("createuser")
	public Users createUser(@RequestBody Users user) {
		return usersRepo.save(user);
	}

	// get Users by id rest api
	@GetMapping("get/{id}")
	public ResponseEntity<Optional<Users>> getUsersById(@PathVariable Long id) {
		Optional<Users> user = usersRepo.findById(id);
		return ResponseEntity.ok(user);
	}

}
