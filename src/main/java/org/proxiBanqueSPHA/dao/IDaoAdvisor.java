package org.proxiBanqueSPHA.dao;

import org.proxiBanqueSPHA.model.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("daoAdvisor")
public interface IDaoAdvisor extends JpaRepository<Advisor, Integer>{

}
