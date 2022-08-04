package com.operation.CheckExists;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.operation.Controller")
@ComponentScan("com.operation.Service")
@EntityScan("com.operation.Model")
@EnableJpaRepositories("com.operation.Repository")
public class CheckExistsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckExistsApplication.class, args);
	}

}
