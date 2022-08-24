package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dockerspring2Application {
	
	@GetMapping("/")
	public String hello() {
		return "hello docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(Dockerspring2Application.class, args);
	}

}
