package org.proxiBanqueSPHA.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component("account")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="AccountType")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int accountNumber;
	private String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));
	private double balance;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private Customer customer;
	
	
	public Account() {
		super();
	
	}
	
	
	public Account(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;

	}


	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", date=" + date + ", balance=" + balance + ", customer="
				+ customer + "]";
	}
	
	
}
