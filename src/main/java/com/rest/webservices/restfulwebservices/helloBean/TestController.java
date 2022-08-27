package com.rest.webservices.restfulwebservices.helloBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Tell spring that it's a controller and handling the HTTP requests
@RestController
public class TestController {

	//method to GET something
	// URI -- /hello-world ---we can map the URI using path keyword in request mapping parameter
	//along with method parameter
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld()
	{
		return "Hello world! service is running that's why you get the response";
	}
	
	//This is short annotation and more readable
	@GetMapping(path = "/there")
	public String there()
	{
		return "There message! service is running that's why you get the response";
	}
	
	@GetMapping(path = "/hello-bean")
	public HelloBeanClassObject helloBean()
	{ 
		return new HelloBeanClassObject("Hello bean created for it");
	}
	
	@GetMapping(path = "/hello-bean/path-variable/{name}")
	public HelloBeanClassObject helloBeanPathVariable(@PathVariable String name)
	{  
		return new HelloBeanClassObject(String.format("Hello bean created with path variable, %s",name));
	}
}
