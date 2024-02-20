package com.idl.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idl.entities.User;
 import com.idl.service.IuserService;
@RestController
	@RequestMapping("/api")
public class UserController {

	

	@Autowired
	IuserService userv;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> pro = userv.findAllUsers();

        return pro;
	    
	}

	@PostMapping("/adduser")
	public User createUser(@Valid @RequestBody User user) {
	    return userv.saveUser(user);
	}
	
	@GetMapping("/users/{fname}")
	public User findByFname(@PathVariable String fname) {
		return userv.getUserByFname(fname);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteUser (@PathVariable long id) {
		return userv.deleteUser(id);
	}
	@PutMapping("/update")
	public User updateUser(@Valid @RequestBody User user) {
	    return userv.updateUser(user);
	}
	


}

