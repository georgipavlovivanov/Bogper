package com.example.msbogper.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.msbogper.dto.Greething;


@RestController
public class GreethingController {
	
	private static final String template ="Hello, %s";
	
	private final AtomicInteger counter = new AtomicInteger();
	
	@GetMapping("/greething")
	public  Greething greeting (@RequestParam(value = "name",
			defaultValue = "World") String name) {
		
		return new Greething(counter.incrementAndGet(),
				String.format(template, name));
	}
	
	
	
}
