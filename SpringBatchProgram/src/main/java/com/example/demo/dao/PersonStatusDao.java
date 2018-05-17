package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.PersistenceContext;

import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.model.PersonStatus;

public interface PersonStatusDao {
	
	public List<Map<String,String>> getAllPersonDetails();
	public List<Map<String, String>> getPersonByStatus(String status);
	public String savePersonDetais(Person person,PersonStatus status,Address address);
}
