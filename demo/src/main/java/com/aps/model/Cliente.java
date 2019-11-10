package com.aps.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Cliente implements UserDetails, Serializable{

	private static final long serialVersionUID = 1L;
	
	public Cliente() {}
	
	public Cliente(String email, String nome, String senha, String telefone, String rua, String numero, String bairro, String cep) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
	}
	
	@Id
	@NotNull
	private String email;
	@Column(name="nome_cliente")
	private String nome;
	private String senha;
	private String telefone;
	private String rua;
	private String numero;
	private String bairro;
	private String cep;
	
//	@ManyToMany
//	@JoinTable(name = "usuario_roles", joinColumns = @JoinColumn(
//				name = "cliente_id", referencedColumnName = "id_cliente"),
//				inverseJoinColumns = @JoinColumn(
//				name = "role_id", referencedColumnName = "role"))
//	private List<Role> roles;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	
	@Override
	public String toString() {
		return "Cliente [email=" + email + ", senha=" + senha + ", nome=" + nome + ", telefone="
				+ telefone + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + "]";
	}
}
