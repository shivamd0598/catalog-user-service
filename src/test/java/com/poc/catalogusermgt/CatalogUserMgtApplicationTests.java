package com.poc.catalogusermgt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.poc.catalogusermgt.model.Role;
import com.poc.catalogusermgt.model.User;
import com.poc.catalogusermgt.model.UserRole;
import com.poc.catalogusermgt.repository.UserRepository;
import com.poc.catalogusermgt.service.UserService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class CatalogUserMgtApplicationTests {

/*	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;
	
	@Test
	@Order(1)
	public void testCreate() throws Exception {
		User user=new User();
		user.setName("Naman Kumar");
		user.setEmail("namank123@gmail.com");
		user.setUsername("Namank123");
		user.setPassword("Namank@123");
		
		Role role=new Role();
		role.setRoleName("USER");
		
		Set<UserRole> userRoleSet=new HashSet<UserRole>();
		UserRole userRole=new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		User user1=this.userService.createUser(user, userRoleSet);
		assertNotNull(userRepository.findById(user1.getId()).get());
	}
	
	@Test
	@Order(2)
	public void testGetByUsername(){
		User user=userService.getUserByUsername("Namank123");
		assertEquals("Namank123",user.getUsername());
	}
*/
}
