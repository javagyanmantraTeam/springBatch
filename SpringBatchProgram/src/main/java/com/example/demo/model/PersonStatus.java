package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="PERSON_STATUS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
public class PersonStatus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int status_Id;
	@Column(name="TITLE",nullable=false)
	private String title;
	@Column(name="CONTENT",nullable=false)
	private String content;
	@Column(name="CREATED_AT")
	private Date created_At;
	@Column(name="UPDATED_AT")
	private Date updated_At;
	@Column(name="STATUS",nullable=false)
	private String status;
	@Column(name="PERSON_ID",nullable=false)
	private int PERSON_ID;
}
