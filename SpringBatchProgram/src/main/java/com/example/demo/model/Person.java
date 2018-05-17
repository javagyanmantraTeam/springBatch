package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="PERSON")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Person implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PERSON_ID",nullable=false)
	private int PERSON_ID;
	@Column(name="FIRST_NAME",nullable=false)
	private String FIRST_NAME;
	@Column(name="LAST_NAME",nullable=false)
	private String LAST_NAME;
	@Column(name="PHONE_NO",nullable=false)
	private int PHONE_NO;
	@ManyToOne(targetEntity=Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ADDRESS_ID",referencedColumnName="PERSON_ID")
	private Address pAddress;
	@OneToOne(targetEntity=PersonStatus.class,cascade=CascadeType.ALL)
	@JoinColumn(name="STATUS_ID",referencedColumnName="PERSON_ID")
	private PersonStatus personStatus;

}
