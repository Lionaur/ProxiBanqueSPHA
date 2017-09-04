package org.proxiBanqueSPHA.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.proxiBanqueSPHA.model.Customer;
import org.proxiBanqueSPHA.service.IServiceCustomer;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController implements Serializable {

	private static final long serialVersionUID = 8303650764387135605L;

	@Resource(name = "serviceCustomer")
	private IServiceCustomer service;

	private List<Customer> listCustomers = new ArrayList<>();

	public List<Customer> getAllCustomers() {
		return listCustomers;
	}

	public void loadAllCustomers() {
		try {
			listCustomers = service.getAllCustomers();
		} catch (Exception exc) {
		}
	}

	public String editCustomer(Customer customer) {

		try {
			service.editCustomer(customer);
		} catch (Exception exc) {

			return null;
		}

		return "list-clients?faces-redirect=true";
	}

	public String deleteCustomer(int idCustomer) {
		try {
			service.deleteCustomer(idCustomer);

		} catch (Exception exc) {

			return null;
		}

		return "list-clients?faces-redirect=true";
	}

}
