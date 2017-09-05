package org.proxiBanqueSPHA.service;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.proxiBanqueSPHA.dao.IDaoAccount;
import org.proxiBanqueSPHA.model.Account;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("serviceAccount")
public class ServiceAccountImpl implements IServiceAccount{

	@Resource(name = "daoAccount")
	private IDaoAccount daoAccount;
	
	
	
	public IDaoAccount getDaoAccount() {
		return daoAccount;
	}

	public void setDaoAccount(IDaoAccount daoAccount) {
		this.daoAccount = daoAccount;
	}

	@Override
	public List<Account> getAllAccount() {
		
		return daoAccount.findAll();
	}

	@Override
	public Account readAccount(int accountNumber) {
	
		return daoAccount.findOne(accountNumber);
	}

	@Override
	public void editAccount(Account account) {
		daoAccount.saveAndFlush(account);
	}

	@Override
	public void deleteAccount(int accountNumber) {
		daoAccount.delete(accountNumber);
		
	}

	@Override
	public List<Account> getCustomerAccount(int id) {

		return daoAccount.findAccountByCustomerId(id);
	}
	
	


}
