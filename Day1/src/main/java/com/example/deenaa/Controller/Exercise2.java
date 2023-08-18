package com.example.deenaa.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise2 {

	@Value("${str}")
	private String name;
	
	@GetMapping("/disp")
	public String print() {
		return "Welcome "+name+" !";
	}
	
	
}
