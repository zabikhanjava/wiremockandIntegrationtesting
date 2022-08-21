package com.valtech.wiremockandIntegrationtesting.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class PoepleControllerAdvice {

	/*
	 * @ExceptionHandler(Exception.class)
	 * 
	 * @ResponseStatus(HttpStatus.BAD_REQUEST)
	 * 
	 * public ResponseEntity<CustomErrorResponse> HandleMismathc(Exception ex) {
	 * System.out.println("BAD_REQUEST");
	 * 
	 * CustomErrorResponse error = new CustomErrorResponse("Bad Request",
	 * ex.getMessage());
	 * 
	 * error.setTimestamp(LocalDateTime.now());
	 * 
	 * error.setStatus((HttpStatus.BAD_REQUEST.value()));
	 * 
	 * return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); }
	 * 
	 */
	@ExceptionHandler(IllegalArgumentException.class)

	public ResponseEntity<String> HandleMismathch(IllegalArgumentException ex) {
		System.out.println("ACCEPTED");

		return new ResponseEntity<>(ex.getMessage(), HttpStatus.ACCEPTED);
	}

	@ExceptionHandler(RuntimeException.class)

	public ResponseEntity<String> HandleMismathches(RuntimeException ex) {

		System.out.println("NOT_FOUND");
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.OK);
	}
}