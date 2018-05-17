package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ADDRESS")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ADDRESS_ID;
	@Column(name="STREET_1",nullable=false)
	private String STREET_1;
	@Column(name="STREET_2",nullable=false)
	private String STREET_2;
	@Column(name="CITY",nullable=false)
	private String CITY;
	@Column(name="STATE",nullable=false)
	private String STATE;
	@Column(name="COUNTRY",nullable=false)
	private String COUNTRY;
	@Column(name="PIN_CODE",nullable=false)
	private int PIN_CODE;
	@Column(name="PERSON_ID",nullable=false)
	private int PERSON_ID;
	
	

}
