package com.valtech.wiremockandIntegrationtesting.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.Test;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

/*
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@WebMvcTest(PoepleController.class)
 */
public class PoepleControllerTest {

	/*
	 * @Autowired MockMvc mvc;
	 * 
	 * @MockBean PoepleService ser;
	 * 
	 * @Autowired private ObjectMapper objectMapper;
	 * 
	 * @Test public void pop() throws JsonProcessingException, Exception,
	 * IllegalArgumentException { People people = new People(32, "zabi", "Indida",
	 * "SKP", 1); ResponseEntity p = ResponseEntity.ok(people);
	 * 
	 * when(ser.createPeople(people)).thenReturn(p);
	 * 
	 * MvcResult mvcResult = mvc.perform(post("/people/create/{mobilenumer}",
	 * 1).contentType("application/json") .param("vehicle",
	 * "23").content(objectMapper.writeValueAsString(people))).andExpect(status().
	 * isOk()) .andReturn(); ;
	 * 
	 * MockHttpServletResponse popo = mvc
	 * .perform(post("/people/create/{mobilenumer}",
	 * 1).contentType("application/json").param("vehicle", "23")
	 * .content(objectMapper.writeValueAsString(people)))
	 * .andExpect(status().isOk()).andReturn().getResponse(); ;
	 * 
	 * String actualResponseBody = mvcResult.getResponse().getContentAsString();
	 * 
	 * assertThat(actualResponseBody).isEqualToIgnoringWhitespace(objectMapper.
	 * writeValueAsString(p.getBody())); //
	 * assertThat(actualResponseBody).isEqualTo(p.getBody());
	 * 
	 * }
	 */
	@Test
	public void ds() {
		assertThat("fff", startsWith("fff"));
		org.junit.Assert.assertThat(10, equalTo(10));

		org.assertj.core.api.Assertions.assertThat(Optional.ofNullable("true")).isPresent();
		org.assertj.core.api.Assertions.assertThat(10).isGreaterThan(0);
	
		
	}	@Test
	public void dsa() {
		PoepleControllerFeign bookClient = Feign.builder()
				  .client(new OkHttpClient())
				  .encoder(new GsonEncoder())
				  .decoder(new GsonDecoder())
				  .target(PoepleControllerFeign.class, "http://localhost:8080/people");
		
		bookClient.getData(10);
		
	}

}
