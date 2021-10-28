package com.runaljain.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthenticationController {
	//GET
	//URI-"/hello-world"
	//method -- return "Hello World"
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
//	@GetMapping(path="/hello-world")
//	public String helloWorld(){
//		return "Hello World!";
//	}
//	
//	//hello-world-bean
//	@GetMapping(path="/hello-world-bean")
//	public HelloWorldBean helloWorldBean(){
//		return new HelloWorldBean("Hello World!");
//	}
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean(){
		return new AuthenticationBean("You Are Authenticated");
	}
	
	
//	//hello-world/path-variable/runal
//		@GetMapping(path="/hello-world/path-variable/{name}")
//		public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
//			return new HelloWorldBean(String.format("Hello World!, %s", name));
//		}
//		
	
	
}
