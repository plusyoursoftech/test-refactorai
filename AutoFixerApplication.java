package com.plusyoursoftech.AutoFixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.plusyoursoftech.AutoFixer", "com.plusyoursoftech.af.service", "com.plusyoursoftech.af.controller"})
@EnableJpaRepositories(basePackages = "com.plusyoursoftech.af.repo")
@EntityScan(basePackages = "com.plusyoursoftech.af.domain")
public class AutoFixerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoFixerApplication.class, args);
	}

}