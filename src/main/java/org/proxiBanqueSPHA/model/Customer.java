package org.proxiBanqueSPHA.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component("customer")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Customer extends Person{
	private String address;
	private String email;
	private String tel;
	private String cp;
//	private List<Account> listAccount=new ArrayList<>();
	
	
		
	public Customer(int id, String name, String firstname) {
		super(id, name, firstname);
		
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
//	public List<Account> getListAccount() {
//		return listAccount;
//	}
//	public void setListAccount(List<Account> listAccount) {
//		this.listAccount = listAccount;
//	}
//	
	

}
