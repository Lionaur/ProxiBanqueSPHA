package org.proxiBanqueSPHA.test;

import org.proxiBanqueSPHA.config.ProxiConfig;
import org.proxiBanqueSPHA.model.Account;
import org.proxiBanqueSPHA.model.Customer;
import org.proxiBanqueSPHA.model.SavingsAccount;
import org.proxiBanqueSPHA.service.IServiceAccount;
import org.proxiBanqueSPHA.service.IServiceCustomer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApliTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProxiConfig.class);
		IServiceCustomer service = context.getBean("serviceCustomer", IServiceCustomer.class);
		IServiceAccount serviceAccount = context.getBean("serviceAccount", IServiceAccount.class);
//		Customer c1 = new Customer("riri","fifi");
//		Customer c2 = new Customer("titi","toto");
//		Customer c3 = new Customer("yiuhi", "ok"); 
//		Customer c4 = new Customer("0104", "78000");
//		Account a1 = new SavingsAccount();
//		Account a2 = new SavingsAccount();
////		
//		c4.addAccount(a1);
//		c4.addAccount(a2);
////		
//		service.editCustomer(c4);
		
//		System.out.println(service.getAllCustomers());
//		
//		service.editCustomer(c2);
//		System.out.println(service.getAllCustomers());
//		service.editCustomer(c3);
//		
////		System.out.println(service.getAllCustomers());
////		service.deleteCustomer(2);
//		
//		System.out.println(service.getAllCustomers());
	
//	System.out.println(serviceAccount.getAllAccount());
	
//	System.out.println(serviceAccount.getCustomerAccount(196608));
	
	service.deleteCustomer(196608);
//	serviceAccount.deleteAccount(229377);
	}
	
	

}
