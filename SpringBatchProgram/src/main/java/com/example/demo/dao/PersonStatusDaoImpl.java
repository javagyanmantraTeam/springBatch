package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.model.PersonStatus;

@Repository
public class PersonStatusDaoImpl  implements PersonStatusDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
		
	}
	
	

	@Override
	public List<Map<String, String>> getAllPersonDetails() {
		String sql="SELECT p.PERSON_ID, p.FIRST_NAME, p.LAST_NAME, p.PHONE_NO,p.STATUS_ID,p.ADDRESS_ID , s.STATUS_ID,s.TITLE, s.CONTENT,s.CREATED_AT,s.UPDATED_AT , a.ADDRESS_ID,a.STREET_1,a.STREET_2,a.CITY,a.STATE,a.COUNTRY,a.PIN_CODE \r\n" + 
				"FROM PERSON AS p\r\n" + 
				"JOIN PERSONSTATUS AS s ON p.STATUS_ID = s.STATUS_ID\r\n" + 
				"JOIN ADDRESS AS a ON p.ADDRESS_ID = a.ADDRESS_ID\r\n" + 
				"ORDER BY p.PERSON_ID DESC ";
		return null;
	}

	@Override
	public List<Map<String, String>> getPersonByStatus(String status) {
		return null;
	}

	@Override
	public String savePersonDetais(Person person,PersonStatus status,Address address) {
		
		try
		{
			
			if(status!=null && address!=null) {
				insertStatus(status);
				insertAddress(address);
				if(person!=null) {
					
					
					int Id=(Integer)sessionFactory.getCurrentSession().save(person);
					System.out.println("Person Is created as personId ::"+Id);
	
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return "record saved successfully" ;
	}
	
	

	public void insertStatus(PersonStatus status) {
		
		try {
			if(status!=null) {
				sessionFactory.getCurrentSession().persist(status);
				System.out.println("PrsonStatus is created with Id ::");
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void insertAddress(Address add) {
		
		 try {
			 if(add!=null) {
				 sessionFactory.getCurrentSession().persist(add);
				 System.out.println("Address is created with AddressId ::");
				 
			 }
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		
	}

}
