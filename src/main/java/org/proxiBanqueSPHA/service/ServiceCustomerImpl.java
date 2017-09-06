package org.proxiBanqueSPHA.service;

import java.util.List;

import javax.annotation.Resource;


import org.proxiBanqueSPHA.dao.IDaoCustomer;
import org.proxiBanqueSPHA.model.Customer;
import org.springframework.stereotype.Service;

@Service("serviceCustomer")
public class ServiceCustomerImpl implements IServiceCustomer {

	@Resource(name = "dao")
	private IDaoCustomer dao;

	public IDaoCustomer getDao() {
		return dao;
	}

	public void setDao(IDaoCustomer dao) {
		this.dao = dao;
	}

	public ServiceCustomerImpl() {
		super();

	}

	@Override
	public List<Customer> getAllCustomers() {

		return dao.findAll();
	}
	
	@Override
	public Customer readCustomer(int id) {
		return dao.findOne(id);
	}

	@Override
	public void editCustomer(Customer customer) {
		dao.saveAndFlush(customer);
		
	}

	@Override
	public void deleteCustomer(int id) {
		dao.delete(id);
		
	}
	

}
