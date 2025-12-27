package com.plusyoursoftech.autofixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.plusyoursoftech.autofixer", "com.plusyoursoftech.autofixer.service", "com.plusyoursoftech.autofixer.controller"})
@EnableJpaRepositories(basePackages = "com.plusyoursoftech.autofixer.repo")
@EntityScan(basePackages = "com.plusyoursoftech.autofixer.domain")
public class AutoFixerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoFixerApplication.class, args);
	}

}