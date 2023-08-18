package com.example.deenaa.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise3 {
	
	@Value("${c}")
	private String color;
	
	@GetMapping("/d")
	public String print() {
		return "My favorite color is "+color+".";
	}

}
