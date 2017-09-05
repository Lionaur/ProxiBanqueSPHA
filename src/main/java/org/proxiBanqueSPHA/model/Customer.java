package org.proxiBanqueSPHA.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@ManagedBean
@Component("customer")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class Customer extends Person {

	private String address;
	private String email;
	private String tel;
	private String cp;
	
	@OneToMany (mappedBy="customer", orphanRemoval=true, cascade= CascadeType.ALL)
	private List<Account> listAccount=new ArrayList<>();
	private String town;
	
	
	public Customer() {
		super();
		
	}


	public Customer(String tel, String cp) {
		super();
		this.tel = tel;
		this.cp = cp;

	}
		

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getCp() {
		return cp;
	}


	public void setCp(String cp) {
		this.cp = cp;
	}



	public List<Account> getListAccount() {
		return listAccount;
	}


	public void setListAccount(List<Account> listAccount) {
		this.listAccount = listAccount;
	}

public void addAccount(Account account) {
	listAccount.add(account);
	account.setCustomer(this);
}


	@Override
	public String toString() {
		return "Customer [ " + ", address="
				+ address + ", email=" + email + ", tel=" + tel + ", cp=" + cp + "]";
	}

	

}
