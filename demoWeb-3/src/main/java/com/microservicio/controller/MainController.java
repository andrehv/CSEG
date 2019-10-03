package com.microservicio.controller;

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.model.Greeting;

@RestController
public class MainController {

	private static final String template= "hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")

	public Greeting greeting(@RequestParam(value="name",defaultValue="world")String Name) 
	{
		
		return new Greeting(counter.incrementAndGet(),String.format(template,Name));
		
	}
}
