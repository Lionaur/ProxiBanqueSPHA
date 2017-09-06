package org.proxiBanqueSPHA.service;

import java.util.List;

import org.proxiBanqueSPHA.model.Advisor;

public interface IServiceAdvisor {
	public List<Advisor> getAllAdvisors();

	public Advisor readAdvisor(int id);

	public void editAdvisor(Advisor advisor);

	public void deleteAdvisor(int id);
}
