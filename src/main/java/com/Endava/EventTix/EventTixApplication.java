package com.Endava.EventTix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class EventTixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventTixApplication.class, args);
	}
	@GetMapping
	public List<String> hello(){
		return List.of("Hello"," world!");
	}
	@GetMapping
	public String hello2(){
		return "Hello world!";
	}
}
