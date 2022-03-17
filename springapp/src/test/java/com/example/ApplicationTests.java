package com.example;


import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class ApplicationTests {
	
	@Autowired
    private MockMvc mockMvc;	
	 
	//Testing Login and Sign Up 
	@Test
	@Transactional
    public void TestCase1() throws Exception {
		 
		//Sign Up
	 	String userOne = "{\"email\":\"Test@gmail.com\",\"password\":\"Testing\",\"mobileNumber\":\"1234598760\",\"username\":\"TestSignup\",\"userRole\":\"user\",\"age\":\"21\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/user/signup")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(userOne)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
//	        	.andExpect(jsonPath("$").value("true"))
	        	.andReturn();
	    
	 	//Login
	    String dataOne = "{\"email\":\"Test@gmail.com\",\"password\":\"Testing\"}";
	    mockMvc.perform(MockMvcRequestBuilders.post("/user/login")
	    		.contentType(MediaType.APPLICATION_JSON)
	    		.content(dataOne)
	    		.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andExpect(jsonPath("$").value("true"))
	        	.andReturn();	
    }
	
	@Test
	@Transactional
    public void TestCase2() throws Exception {
		 
	 	mockMvc.perform(MockMvcRequestBuilders.get("/admin/dashboard")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();

	 	String userOne = "{\"hallID\":\"011\",\"hallNo\":\"123\",\"adminID\":\"5678\",\"status\":\"available\",\"price\":\"5000\",\"type\":\"Day\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/admin/addHall")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(userOne)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();
	    
    }
	
	@Test
	@Transactional
    public void TestCase3() throws Exception {
		 
		String dataOne = "{\"email\":\"Test@gmail.com\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/admin/profile")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(dataOne)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();	 	
    }

	
	@Test
	@Transactional
    public void TestCase4() throws Exception {
		 
	 	mockMvc.perform(MockMvcRequestBuilders.get("/user/dashboard")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();

	 	String userOne = "{\"resortName\":\"Resort1\",\"adminID\":\"admin@iamneo.ai\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/user/halls")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(userOne)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();
	 	
    }
	
	@Test
	@Transactional
    public void TestCase5() throws Exception {

	 	String userOne = "{\"email\":\"superadmin@iamneo.ai\",\"password\":\"iamneo\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/super/login")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(userOne)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();
	 	
	 	String dataOne = "{\"email\":\"admin1@iamneo.ai\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/super/deleteAdmin")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(dataOne)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();
	 	
    }

}
