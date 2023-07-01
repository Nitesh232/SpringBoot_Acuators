package com.nitesh.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitesh.springboot.props.TestFileConfiguration;

@RestController
public class DemoController {

	@Autowired
	private TestFileConfiguration props;
	
	/*
	
	@GetMapping("/welcome")
	public String getWelcomemsg() {
		
		Map<String,String> messages = props.getMessages();
		String msg = messages.get("welcome");
		
		return msg;
	}
	
	@GetMapping("/wish")
	public String getWishmsg() {
		
		Map<String,String> messages = props.getMessages();
		String msg = messages.get("wish");
		
		return msg;
	}
	
	
	
	@GetMapping("/greet")
	public String getGreetmsg() {
				
		Map<String,String> messages = props.getMessages();
		String msg = messages.get("greet");
		
		return msg;
	}
	
	*/
	

	@GetMapping("/welcome")
	public String getWelcomemsg() {
		
		return props.getMessages().get("welcome");
	}
	
	@GetMapping("/wish")
	public String getWishmsg() {
		
		return props.getMessages().get("wish");
	}
	
	
	
	@GetMapping("/greet")
	public String getGreetmsg() {
					
		return props.getMessages().get("greet");
	}
	
	
	
}
