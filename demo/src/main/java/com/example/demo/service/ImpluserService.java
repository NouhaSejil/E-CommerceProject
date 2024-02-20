package com.idl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idl.entities.User;
import com.idl.repository.UserRepository;
@Service
public class ImpluserService implements IuserService {
	@Autowired
	UserRepository urepos;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return urepos.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return urepos.findAll();
	}
	@Override
	public User getUserByFname(String fname) {
		// TODO Auto-generated method stub
		return urepos.findByFname(fname);
	}

	@Override
	public String deleteUser(long id) {
		urepos.deleteById( id);
		return "User removed "+id;
	}

	@Override
	public User updateUser(User user) {
		User existingUser=urepos.findById(user.getId()).orElse(null);
		existingUser.setEmail(user.getEmail());
		existingUser.setPwd(user.getPwd());
		existingUser.setFname(user.getFname());
		existingUser.setLname(user.getLname());
		return urepos.save(existingUser);
	}
	
	




}

