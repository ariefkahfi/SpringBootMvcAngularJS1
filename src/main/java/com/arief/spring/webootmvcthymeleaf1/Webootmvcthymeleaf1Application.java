package com.arief.spring.webootmvcthymeleaf1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.arief.spring.webcontrollers",
		"com.arief.spring.api",
		"com.arief.spring.services.userService"})
@EntityScan("com.arief.spring.entity")
@EnableJpaRepositories("com.arief.spring.services")
public class Webootmvcthymeleaf1Application {

	public static void main(String[] args) {
		SpringApplication.run(Webootmvcthymeleaf1Application.class, args);
	}

}
