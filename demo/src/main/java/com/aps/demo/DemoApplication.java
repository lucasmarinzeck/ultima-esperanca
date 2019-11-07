package com.aps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aps.controller.CadastroForm;
import com.aps.model.Cliente;
import com.aps.repository.ClienteRepository;

@SpringBootApplication
@ComponentScan(basePackageClasses = { CadastroForm.class})
@EntityScan(basePackageClasses ={Cliente.class})
@EnableJpaRepositories(basePackageClasses = ClienteRepository.class )
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
