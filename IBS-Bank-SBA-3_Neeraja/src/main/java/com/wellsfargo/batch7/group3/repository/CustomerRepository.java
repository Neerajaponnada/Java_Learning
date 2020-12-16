package com.wellsfargo.batch7.group3.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.entities.CustomerAccount;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerAccount, Long>{


	List<CustomerAccount> findByRegId(long regId);

	List<CustomerAccount> findByUserName(String userName);

	List<CustomerAccount> findByCustAcctType(String custAcctType);


}
