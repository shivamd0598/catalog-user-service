package com.poc.catalogusermgt.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;
	@Column(nullable = false)
	private String roleName;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "role")
	@JsonIgnore
	private Set<UserRole> userRoles=new HashSet<UserRole>();
	
}
