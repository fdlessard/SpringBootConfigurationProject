package io.fdlessard.codebites;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")

@PropertySource("classpath:someSortOfService.properties")
@PropertySource("classpath:message.properties")

@PropertySource("classpath:mapFormat.properties")
public class SpringBootConfigurationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigurationProjectApplication.class, args);
	}
}
