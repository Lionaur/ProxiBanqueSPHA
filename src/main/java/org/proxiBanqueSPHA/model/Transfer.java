package org.proxiBanqueSPHA.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component("transfer")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Transfer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTransfert;
	
	
	private Account debitAccount;
	private Account creditAccount;
	private LocalDateTime dateTransfer = LocalDateTime.now();
	private Double amount;
	
	
	public Transfer() {
		super();
	}
	
		
	public Transfer(Account debitAccount, Account creditAccount, LocalDateTime dateTransfer, Double amount) {
		super();
		this.debitAccount = debitAccount;
		this.creditAccount = creditAccount;
		this.dateTransfer = dateTransfer;
		this.amount = amount;
	}



	public int getIdTransfert() {
		return idTransfert;
	}
	public void setIdTransfert(int idTransfert) {
		this.idTransfert = idTransfert;
	}
	public Account getDebitAccount() {
		return debitAccount;
	}
	public void setDebitAccount(Account debitAccount) {
		this.debitAccount = debitAccount;
	}
	public Account getCreditAccount() {
		return creditAccount;
	}
	public void setCreditAccount(Account creditAccount) {
		this.creditAccount = creditAccount;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}



	public LocalDateTime getDateTransfer() {
		return dateTransfer;
	}



	public void setDateTransfer(LocalDateTime dateTransfer) {
		this.dateTransfer = dateTransfer;
	}
	
	
	
	
	
	
}
