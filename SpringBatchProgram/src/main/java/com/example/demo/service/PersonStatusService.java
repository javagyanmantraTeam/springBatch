package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.model.PersonStatus;

public interface PersonStatusService {
	
	public List<Map<String,String>> getAllPersonDetails();
	public List<Map<String, String>> getPersonByStatus(String status);
	public String saveAllPersonDetais(Person person,PersonStatus status,Address address) throws Throwable;

}
