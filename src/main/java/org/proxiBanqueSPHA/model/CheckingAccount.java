package org.proxiBanqueSPHA.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@DiscriminatorValue("Compte_courant")
@OnDelete(action = OnDeleteAction.CASCADE)
public class CheckingAccount extends Account{
	
//	private double overdraft = -1000;
//
//	public double getOverdraft() {
//		return overdraft;
//	}
//
//	public void setOverdraft(double overdraft) {
//		this.overdraft = overdraft;
//	}
}
