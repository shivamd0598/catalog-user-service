package com.poc.catalogusermgt.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.catalogusermgt.intercomm.ProductClient;
import com.poc.catalogusermgt.model.Role;
import com.poc.catalogusermgt.model.User;
import com.poc.catalogusermgt.model.UserRole;
import com.poc.catalogusermgt.service.UserService;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
	UserService userService;
	@Autowired
	ProductClient productClient;
	public UserController(UserService userService) {
		this.userService=userService;
	}
	@PostMapping("/users/registration")
	public ResponseEntity<User> userRegistration(@RequestBody User user) throws Exception {
		Set<UserRole> roles=new HashSet<UserRole>();
		Role role=new Role();
		role.setRoleName(user.getRole_name());
		
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		return new ResponseEntity<User>(this.userService.createUser(user, roles),HttpStatus.CREATED);
	}
	@GetMapping("/users/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUserByUsername(username);
	}
	@GetMapping("/users/vendorlist")
	public ResponseEntity<?> getVendorList(){
		return productClient.getAllVendors();
	}
}
