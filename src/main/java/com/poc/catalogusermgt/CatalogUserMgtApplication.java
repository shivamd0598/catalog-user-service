package com.poc.catalogusermgt;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.poc.catalogusermgt.service.UserService;
import com.poc.catalogusermgt.model.Role;
import com.poc.catalogusermgt.model.User;
import com.poc.catalogusermgt.model.UserRole;

@SpringBootApplication
@EnableFeignClients
public class CatalogUserMgtApplication{

	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(CatalogUserMgtApplication.class, args);
	}
	/*
	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setName("Shivam Dhar");
		user.setEmail("shivamd123@gmail.com");
		user.setUsername("Shivamd123");
		user.setPassword("Shivamd@123");
		
		Role role=new Role();
		role.setRoleName("ADMIN");
		
		Set<UserRole> userRoleSet=new HashSet<UserRole>();
		UserRole userRole=new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		User user1=this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());
		
	}
	*/

}
