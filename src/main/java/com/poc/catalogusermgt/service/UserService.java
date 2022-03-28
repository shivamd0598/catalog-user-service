package com.poc.catalogusermgt.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.poc.catalogusermgt.model.User;
import com.poc.catalogusermgt.model.UserRole;

@Service
public interface UserService {
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	public User getUserByUsername(String username);
}
