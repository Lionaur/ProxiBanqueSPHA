package org.proxiBanqueSPHA.test;

import org.proxiBanqueSPHA.config.ProxiConfig;
import org.proxiBanqueSPHA.model.Customer;
import org.proxiBanqueSPHA.service.IServiceCustomer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApliTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProxiConfig.class);
		IServiceCustomer service = context.getBean("serviceCustomer", IServiceCustomer.class);
		Customer c1 = new Customer("riri","fifi");
		Customer c2 = new Customer("titi","toto");
		Customer c3 = new Customer(1, "yiuhi", "ok"); 
		
		c1.setAddress("12 rue test");
		c1.setEmail("fifi.r@test.test");
		service.editCustomer(c1);
		
		System.out.println(service.getAllCustomers());
//		
//		service.editCustomer(c2);
//		System.out.println(service.getAllCustomers());
//		service.editCustomer(c3);
		
//		System.out.println(service.getAllCustomers());
//		service.deleteCustomer(2);
//		
//		System.out.println(service.getAllCustomers());
	}

}
