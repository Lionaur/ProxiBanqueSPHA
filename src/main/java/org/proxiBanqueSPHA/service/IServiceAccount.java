package org.proxiBanqueSPHA.service;

import java.util.List;
import java.util.Set;

import org.proxiBanqueSPHA.model.Account;


public interface IServiceAccount {

	public List<Account> getAllAccount();
	public Account readAccount(int accountNumber);
	public void editAccount(Account account);
	public void deleteAccount(int accountNumber);
	public List<Account> getCustomerAccount(int id);
}
