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
@DiscriminatorValue("Compte_epargne")
@OnDelete(action = OnDeleteAction.CASCADE)
public class SavingsAccount extends Account{

	private double rates = 1.03;

	public double getRates() {
		return rates;
	}

	public void setRates(double rates) {
		this.rates = rates;
	}
	
	
}
