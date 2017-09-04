package org.proxiBanqueSPHA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String name;
	private String firstname;
	
	public int getId() {
		return id;
	}
	
	public Person() {
		super();
		
	}
	
	
	
	public Person(String name, String firstname) {
		super();
		this.name = name;
		this.firstname = firstname;
	}

	public Person(int id, String name, String firstname) {
		super();
		this.id = id;
		this.name = name;
		this.firstname = firstname;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
}
