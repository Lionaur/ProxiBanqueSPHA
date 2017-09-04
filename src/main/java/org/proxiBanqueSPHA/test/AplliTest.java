package org.proxiBanqueSPHA.test;


import org.proxiBanqueSPHA.config.ProxiConfig;
import org.proxiBanqueSPHA.model.Customer;
import org.proxiBanqueSPHA.service.IServiceCustomer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplliTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProxiConfig.class);
		IServiceCustomer service = context.getBean("serviceCustomer", IServiceCustomer.class);
		Customer c = context.getBean("customer", Customer.class);
		c.setName("toto");
		service.createCustomer(c);
		service.getAllCustomers();
	}

}
