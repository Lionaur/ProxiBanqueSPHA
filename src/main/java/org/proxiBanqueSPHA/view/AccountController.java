package org.proxiBanqueSPHA.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.proxiBanqueSPHA.model.Account;
import org.proxiBanqueSPHA.service.ServiceAccountImpl;

public class AccountController {

	@Resource(name = "serviceAccount")
	private ServiceAccountImpl serviceAccount;

	private List<Account> listAccount = new ArrayList<>();

	public List<Account> getAllAccount() {
		return listAccount;
	}

	public void loadAllAccount() {
		try {
			listAccount = serviceAccount.getAllAccount();
		} catch (Exception exc) {
		}
	}

	public String editAccount(Account account) {

		try {
			serviceAccount.editAccount(account);
		} catch (Exception exc) {

			return null;
		}

		return "list-clients?faces-redirect=true";
	}

	public String deleteAccount(int accountNumber) {
		try {
			serviceAccount.deleteAccount(accountNumber);

		} catch (Exception exc) {

			return null;
		}

		return "list-clients?faces-redirect=true";
	}

	public void loadCustomerAccount(int id) {
		try {
			listAccount = serviceAccount.getCustomerAccount(id);
		} catch (Exception exc) {
		}
	}

}
