package com.example.deenaa.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {
	
	@GetMapping("/")
	public String display() {
		return "Welcome";
	}
}
