package org.proxiBanqueSPHA.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.proxiBanqueSPHA.config.ProxiConfig;
import org.proxiBanqueSPHA.model.Customer;
import org.proxiBanqueSPHA.service.IServiceCustomer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.format.annotation.DateTimeFormat;

public class ApliTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProxiConfig.class);
		IServiceCustomer service = context.getBean("serviceCustomer", IServiceCustomer.class);
		// Customer c1 = new Customer("riri","fifi");
		// Customer c2 = new Customer("titi","toto");
		// Customer c3 = new Customer(1, "yiuhi", "ok");
		//
		// service.editCustomer(c1);
		//
		// System.out.println(service.getAllCustomers());
		//
		// service.editCustomer(c2);
		// System.out.println(service.getAllCustomers());
		// service.editCustomer(c3);
		//
		// System.out.println(service.getAllCustomers());
		// service.deleteCustomer(2);

		// System.out.println(service.getAllCustomers());
		service.getAllCustomers();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
		String dateTransfer = LocalDateTime.now().format(dtf);
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
	}

}
