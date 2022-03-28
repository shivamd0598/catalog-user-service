package com.poc.catalogusermgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.catalogusermgt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
}
