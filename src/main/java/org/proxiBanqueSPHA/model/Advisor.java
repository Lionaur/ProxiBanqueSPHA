package org.proxiBanqueSPHA.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component("advisor")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Advisor extends Person {

	@OneToMany(mappedBy="advisor", cascade=CascadeType.ALL)
	private List<Customer> listCustomer = new ArrayList<>();

	public Advisor() {
		super();
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}
	
	public void addCustomer(Customer customer) {
		listCustomer.add(customer);
		customer.setAdvisor(this);
	}
}
