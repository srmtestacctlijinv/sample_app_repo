package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HappyController {

	@GetMapping("/hello")
	public String greetings() {
		return "Hello World new trigger Docker build rebuild!";
	}
}
