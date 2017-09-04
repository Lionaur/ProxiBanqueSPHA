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

	@Override
	public List<Customer> getAllCustomers() {
		return dao.findAll();
	}

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
	public void createCustomer(Customer customer) {
		dao.saveAndFlush(customer);

	}

}
