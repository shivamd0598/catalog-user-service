package com.poc.catalogusermgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.catalogusermgt.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
