package com.poc.catalogusermgt.service.impl;

import java.util.Set;


import org.springframework.stereotype.Service;

import com.poc.catalogusermgt.model.User;
import com.poc.catalogusermgt.model.UserRole;
import com.poc.catalogusermgt.repository.RoleRepository;
import com.poc.catalogusermgt.repository.UserRepository;
import com.poc.catalogusermgt.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
		this.userRepository=userRepository;
		this.roleRepository=roleRepository;
	}
	@Override
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local=userRepository.findByUsername(user.getUsername());
		if(local!=null) {
			System.out.println("User is already there!!!");
			throw new Exception("User already present!!!");
		}
		else {
			//create user
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local=userRepository.save(user);
		}
		return local;
	}
	
}
