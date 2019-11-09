package com.aps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aps.controller.CadastroForm;
import com.aps.model.Cliente;
import com.aps.repository.ClienteRepository;
import com.aps.security.ImplementsUserDetailsService;
import com.aps.security.WebSecurityConfig;

@SpringBootApplication
@ComponentScan(basePackageClasses = { CadastroForm.class, WebSecurityConfig.class, ClienteRepository.class, Cliente.class})
@EntityScan(basePackageClasses ={Cliente.class})
@EnableJpaRepositories(basePackageClasses = {ClienteRepository.class, ImplementsUserDetailsService.class} )
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
