package org.proxiBanqueSPHA.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.proxiBanqueSPHA.config.ProxiConfig;
import org.proxiBanqueSPHA.model.Account;
import org.proxiBanqueSPHA.model.Advisor;
import org.proxiBanqueSPHA.model.Customer;
import org.proxiBanqueSPHA.model.SavingsAccount;
import org.proxiBanqueSPHA.service.IServiceAccount;
import org.proxiBanqueSPHA.service.IServiceAdvisor;
import org.proxiBanqueSPHA.service.IServiceCustomer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.format.annotation.DateTimeFormat;

public class ApliTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProxiConfig.class);
		IServiceAdvisor serviceAdvisor = context.getBean("serviceAdvisor", IServiceAdvisor.class);

		Advisor a1 = new Advisor();
		a1.setFirstname("Bob");
		Advisor a2 = new Advisor();
		a2.setName("Julius");

		serviceAdvisor.editAdvisor(a2);
		serviceAdvisor.editAdvisor(a1);


		a2.setFirstname("Jeanne");
		serviceAdvisor.editAdvisor(a2);
//		serviceAdvisor.deleteAdvisor(a1.getId());

		IServiceCustomer service = context.getBean("serviceCustomer", IServiceCustomer.class);

		Customer c1 = new Customer("riri", "fifi");
		Customer c2 = new Customer("titi", "toto");
		service.editCustomer(c1);
		service.editCustomer(c2);
		c1.setAddress("12 rue test");
		c1.setEmail("fifi.r@test.test");
//		service.editCustomer(c1);

//		service.deleteCustomer(c2.getId());
		a2.addCustomer(c1);
		serviceAdvisor.editAdvisor(a2);

		// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
		// String dateTransfer = LocalDateTime.now().format(dtf);
		// LocalDateTime date = LocalDateTime.now();
		// System.out.println(date);
		//
		// IServiceAccount serviceAccount = context.getBean("serviceAccount",
		// IServiceAccount.class);
		// Customer c1 = new Customer("riri","fifi");
		// Customer c2 = new Customer("titi","toto");
		// Customer c3 = new Customer("yiuhi", "ok");
		// Customer c4 = new Customer("0104", "78000");
		// Account a1 = new SavingsAccount();
		// Account a2 = new SavingsAccount();
		//
		// c4.addAccount(a1);
		// c4.addAccount(a2);
		//
		// service.editCustomer(c4);

		// System.out.println(service.getAllCustomers());
		//
		// service.editCustomer(c2);
		// System.out.println(service.getAllCustomers());
		// service.editCustomer(c3);
		//
		// System.out.println(service.getAllCustomers());
		// service.deleteCustomer(2);
		//
		// System.out.println(service.getAllCustomers());

		// System.out.println(serviceAccount.getAllAccount());

		// System.out.println(serviceAccount.getCustomerAccount(196608));

//		service.getAllCustomers();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
//		String dateTransfer = LocalDateTime.now().format(dtf);
//		LocalDateTime date = LocalDateTime.now();
//		System.out.println(date);
//
		IServiceAccount serviceAccount = context.getBean("serviceAccount", IServiceAccount.class);
//		Customer c1 = new Customer("riri","fifi");
//		Customer c2 = new Customer("titi","toto");
//		Customer c3 = new Customer("yiuhi", "ok"); 
//		Customer c4 = new Customer("0104", "78000");
//		Account a1 = new SavingsAccount();
//		Account a2 = new SavingsAccount();
//		
//		c4.addAccount(a1);
//		c4.addAccount(a2);
//		
//		service.editCustomer(c4);
		
//		System.out.println(service.getAllCustomers());
//		
//		service.editCustomer(c2);
//		System.out.println(service.getAllCustomers());
//		service.editCustomer(c3);
//		
//		System.out.println(service.getAllCustomers());
//		service.deleteCustomer(2);
//		
//		System.out.println(service.getAllCustomers());
	
//	System.out.println(serviceAccount.getAllAccount());
	
	
//	serviceAccount.deleteAccount(229377);

		((AnnotationConfigApplicationContext) context).close();
	}

}
