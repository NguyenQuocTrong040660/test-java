package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@ComponentScan(basePackages = "com.example.demo.*")
@EntityScan(basePackages ="com.example.demo.Entity") // path of the entity model
@EnableJpaRepositories("com.example.demo.Repository") // path of jpa repository 
@SpringBootApplication
public class TestJavaCuscNqtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJavaCuscNqtApplication.class, args);
		System.out.println("Helo");
	}

}
