package com.codindojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	@RequestMapping( value = "/your_server", method = RequestMethod.GET )
	public String mainPage() {
		return "<h1>Hello Human!</h1>" + "<h2>Welcome to Spring Boot!</h2>";
	}
	
	@RequestMapping( value = "/your_server/", method = RequestMethod.GET )
	public String index( @RequestParam ( value = "name", required = false ) String searhQuery ) {
		return "Hello " + searhQuery + "!" + 
				"<h4>Welcome to SpringBoot!</h4>" +
				"<h4> <a href=\"/your_server\">Go Back</a> </h4>";
	}

	
	

}
