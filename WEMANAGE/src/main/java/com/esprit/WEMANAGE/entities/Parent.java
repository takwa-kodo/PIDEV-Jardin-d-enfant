package com.esprit.WEMANAGE.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parent {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ; 
}
