package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.model.PersonStatus;
import com.example.demo.service.PersonStatusService;

@RestController
public class ApplicationController {
	
	@Autowired
	private PersonStatusService service;
	
	@PostMapping(value="/save",headers="Accept=application/json")
	public String  savePerson(@RequestBody Person person, @RequestBody Address address,@RequestBody PersonStatus status) throws Throwable{
		service.saveAllPersonDetais(person, status, address);
		 
		return "Succesfuly saved";
		
	}

}
