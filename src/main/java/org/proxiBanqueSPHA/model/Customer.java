package org.proxiBanqueSPHA.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@ManagedBean
@Component("customer")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Customer extends Person {

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// private int id;
	// private String name;
	// private String firstname;
	private String address;
	private String email;
	private String tel;
	private String cp;
	private String town;

	// private List<Account> listAccount=new ArrayList<>();

	public Customer() {
		super();

	}

	// public Customer(String name, String firstname) {
	// super();
	// this.name = name;
	// this.firstname = firstname;
	// }
	//
	//
	//
	//
	//
	//
	// public Customer(int id, String name, String firstname) {
	// super();
	// this.id = id;
	// this.name = name;
	// this.firstname = firstname;
	// }

	public Customer(int id, String name, String firstname) {
		super(id, name, firstname);
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String firstname) {
		super(name, firstname);
		// TODO Auto-generated constructor stub
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
	// public int getId() {
	// return id;
	// }
	// public void setId(int id) {
	// this.id = id;
	// }
	// public String getName() {
	// return name;
	// }
	// public void setName(String name) {
	// this.name = name;
	// }
	// public String getFirstname() {
	// return firstname;
	// }
	// public void setFirstname(String firstname) {
	// this.firstname = firstname;
	// }
	//

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

	// public List<Account> getListAccount() {
	// return listAccount;
	// }
	// public void setListAccount(List<Account> listAccount) {
	// this.listAccount = listAccount;
	// }
	//
	@Override
	public String toString() {
		return "Customer [id=" + this.getId() + ", name=" + this.getName() + ", firstname=" + this.getFirstname()
				+ ", address=" + address + ", email=" + email + ", tel=" + tel + ", cp=" + cp + "]";
	}

}
