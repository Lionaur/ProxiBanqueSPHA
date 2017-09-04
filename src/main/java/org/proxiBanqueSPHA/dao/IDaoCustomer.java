package org.proxiBanqueSPHA.dao;

import org.proxiBanqueSPHA.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("dao")
public interface IDaoCustomer extends JpaRepository<Customer, Integer>{

}
