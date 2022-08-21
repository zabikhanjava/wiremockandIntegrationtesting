package com.valtech.wiremockandIntegrationtesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;

@RestController
@Validated
@RequestMapping("/people")
public class PoepleController {

	@Autowired
	PoepleService peService;

	PoepleControllerFeign poepleFeign;

	@GetMapping("/update/{mobilenumber}")
	public ResponseEntity<People> updatePeople(@RequestParam("vehicle") int vehicle, @RequestBody People people,
			@PathVariable("mobilenumber") int mobilenumber) {

		People people1 = people;
		System.out.println(vehicle + "" + people + mobilenumber);
		ResponseEntity enty = new ResponseEntity<>(people1, HttpStatus.ACCEPTED);
		return enty;
	}

	@PostMapping("/create/{mobilenumber}")
	public ResponseEntity<People> createPeople(@RequestParam("vehicle") Integer vehicle, @RequestBody People people,
			@PathVariable(required = false) Integer mobilenumber) throws IllegalArgumentException {
		if (!people.getName().equals("zabi")) {
			System.out.println("riased");
			throw new RuntimeException("some");
		}
		if (mobilenumber == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "please enter mobile number");
		}
		return peService.createPeople(people);
	}

	@GetMapping("/get/{mobilenumber}")
	public People getPeople(@PathVariable(required = false) Integer mobilenumber) {
		return new People(23, "zabi", "pubby", "kabhi", 0);
	}

	@GetMapping("/getfromFeign")
	public People getfromFeign() {
		PoepleControllerFeign bookClient = Feign.builder().client(new OkHttpClient()).encoder(new GsonEncoder())
				.decoder(new GsonDecoder()).target(PoepleControllerFeign.class, "http://localhost:8080/people");

		return bookClient.getData(10);

	}
}
