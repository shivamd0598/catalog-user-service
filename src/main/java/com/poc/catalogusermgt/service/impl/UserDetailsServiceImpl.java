package com.poc.catalogusermgt.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.poc.catalogusermgt.model.User;
import com.poc.catalogusermgt.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService{
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=this.userRepository.findByUsername(username);
		if(user==null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("No user found!!!");
		}
		return user;
	}

}
