package com.valtech.wiremockandIntegrationtesting.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
public class PoepleService {

	
	
	public  ResponseEntity<People> createPeople(People people) {

		System.out.println("hello");
		People people1=people;
		ResponseEntity enty=new ResponseEntity<>(people1,HttpStatus.ACCEPTED);
		return enty;
		
	}

}
