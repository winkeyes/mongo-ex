package com.winkeyes.mongoex.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winkeyes.mongoex.model.Person;
import com.winkeyes.mongoex.services.MainService;

@RestController
@RequestMapping("/people")
public class MainController {
	@Autowired
	public MainService service;
	
	@GetMapping({"/person/{name}"})
	public String getName(@PathVariable String name) throws InterruptedException {
		return service.getName(name);
	}
	
	@GetMapping({"/{all}"})
	public List<Person> getAllPeople(@PathVariable String all) throws InterruptedException {
		return service.getAll();
	}

}
