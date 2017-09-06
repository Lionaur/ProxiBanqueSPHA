package org.proxiBanqueSPHA.service;

import java.util.List;

import javax.annotation.Resource;

import org.proxiBanqueSPHA.dao.IDaoAdvisor;
import org.proxiBanqueSPHA.model.Advisor;
import org.springframework.stereotype.Service;

@Service("serviceAdvisor")
public class ServiceAdvisorImpl implements IServiceAdvisor {

	@Resource(name = "daoAdvisor")
	private IDaoAdvisor daoAdvisor;

	public ServiceAdvisorImpl() {
		super();
	}

	public IDaoAdvisor getDaoAdvisor() {
		return daoAdvisor;
	}

	public void setDaoAdvisor(IDaoAdvisor daoAdvisor) {
		this.daoAdvisor = daoAdvisor;
	}

	@Override
	public List<Advisor> getAllAdvisors() {

		return daoAdvisor.findAll();
	}

	@Override
	public Advisor readAdvisor(int id) {
		return daoAdvisor.findOne(id);
	}

	@Override
	public void editAdvisor(Advisor advisor) {
		daoAdvisor.saveAndFlush(advisor);

	}

	@Override
	public void deleteAdvisor(int id) {
		daoAdvisor.delete(id);

	}

}
