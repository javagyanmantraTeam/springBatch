package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.PersonStatusDao;
import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.model.PersonStatus;
@Service
@Transactional
public class PersonStatusServiceImpl implements PersonStatusService {
	@Autowired
	private PersonStatusDao dao;

	@Override
	public List<Map<String, String>> getAllPersonDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> getPersonByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveAllPersonDetais(Person person, PersonStatus status, Address address) throws Throwable {
		if(status!=null && address!=null && person!=null) {
			dao.savePersonDetais(person, status, address);
			}
		else {
			throw new Exception("Record not inserted sucessfylly");
		}
		return "Record inserted sucessfully";
	}

}
