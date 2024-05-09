package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

	@GetMapping("/dev")
	public String getDev() {
		return "This is Developer";
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "This is Tester";
	}
	
	@GetMapping("/qa")
	public String getQa() {
		return "This is QA Team";
	}
}
