package org.proxiBanqueSPHA.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.annotation.Resource;
import javax.faces.application.FacesMessage;


import javax.faces.context.FacesContext;

import org.proxiBanqueSPHA.model.Account;

import org.proxiBanqueSPHA.service.ServiceAccountImpl;
import org.springframework.stereotype.Controller;

@Controller("accountController")
public class AccountController implements Serializable {

	private static final long serialVersionUID = 8303650764387135606L;

	@Resource(name = "serviceAccount")
	private ServiceAccountImpl serviceAccount;

	private Account selectedAccount;

	private List<Account> listAccount = new ArrayList<>();

	public Account getSelectedAccount() {
		return selectedAccount;
	}

	public void setSelectedAccount(Account selectedAccount) {
		this.selectedAccount = selectedAccount;
	}

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

		return "listeComptes?faces-redirect=true";
	}

	public String deleteAccount(int accountNumber) {
		try {
			serviceAccount.deleteAccount(accountNumber);

		} catch (Exception exc) {

			return null;
		}

		return "listeComptes?faces-redirect=true";
	}

	public String loadCustomerAccount(int id) {
		// try {
		// listAccount = serviceAccount.getCustomerAccount(id);
		//
		// ExternalContext externalContext =
		// FacesContext.getCurrentInstance().getExternalContext();
		//
		// Map<String, Object> requestMap = externalContext.getRequestMap();
		// requestMap.put("account", getAccount(id));
		//
		// } catch (Exception exc) {
		// addErrorMessage(exc);
		// return null;
		try {
			listAccount = serviceAccount.getCustomerAccount(id);
		} catch (Exception exc) {
		}
		return "ListeComptes?faces-redirect=true";

	}

	public List<Account> getAccount(int id) {

		return listAccount;
	}

	private void addErrorMessage(Exception exc) {
		FacesMessage message = new FacesMessage("Error: " + exc.getMessage());
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
