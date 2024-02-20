package com.idl.service;



import com.idl.entities.User;


import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface IuserService {

	User saveUser(User user);

	List<User> findAllUsers();
	

	User getUserByFname(String fname);
	 String deleteUser(long id);
	 
	 User updateUser(User user);


	


}
