package com.brunosc.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@RequestMapping("/")
    public String home() {
        return "Hello Docker World - AUI!";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
