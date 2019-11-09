//package com.aps.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//import org.springframework.security.core.GrantedAuthority;
//
//@Entity
//public class Role implements GrantedAuthority{
//
//	@Id
//	protected String role;
//	
//	@ManyToMany(mappedBy = "roles")
//	private List<Cliente> cliente;
//	
//	@Override
//	public String getAuthority() {
//		return this.role;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//}
