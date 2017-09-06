package org.proxiBanqueSPHA.dao;

import java.util.List;

import org.proxiBanqueSPHA.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("daoAccount")
public interface IDaoAccount extends JpaRepository<Account, Integer>{

	public List<Account> findAccountByCustomerId(int id);
}
