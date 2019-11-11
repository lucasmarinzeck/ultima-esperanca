package com.aps.security;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.aps.model.Cliente;
import com.aps.repository.ClienteRepository;

@Transactional
@Repository
public class ImplementsUserDetailsService implements UserDetailsService{

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Cliente cliente = clienteRepository.findByEmail(email);
		if(cliente == null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("Usuario não encontrado");
		}
		
		return new Cliente(cliente.getEmail(),
						   cliente.getNome(),
						   cliente.getSenha(),
						   cliente.getTelefone(),
						   cliente.getRua(),
						   cliente.getNumero(), 
						   cliente.getBairro(),
						   cliente.getCep());
	}

	
}
