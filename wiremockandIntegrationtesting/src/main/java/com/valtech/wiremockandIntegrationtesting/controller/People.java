package com.valtech.wiremockandIntegrationtesting.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {

	
	int age;
	String name;
	String country;
	String city;
	int id;

}
