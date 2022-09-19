package com.example.authenticatingldap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "Welcome to the home page!";
	}
	
	@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<?> welcome() {
		return new ResponseEntity<>(
			      "Welcome to home page!!!!!", 
			      HttpStatus.OK);
	}
}
