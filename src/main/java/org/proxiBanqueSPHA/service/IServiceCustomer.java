package org.proxiBanqueSPHA.service;

import java.util.List;

import org.proxiBanqueSPHA.model.Customer;

public interface IServiceCustomer {
	public List<Customer> getAllCustomers();
	public Customer readCustomer(int idCustomer);
	public void editCustomer(Customer customer);
	public void deleteCustomer(int idCustomer);
	
}
