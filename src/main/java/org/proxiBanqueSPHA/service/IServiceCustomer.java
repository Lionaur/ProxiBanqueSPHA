package org.proxiBanqueSPHA.service;

import java.util.List;

import org.proxiBanqueSPHA.model.Customer;

public interface IServiceCustomer {
	public void createCustomer(Customer customer);
	public List<Customer> getAllCustomers();
}
