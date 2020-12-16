package com.wellsfargo.batch7.group3.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.group3.entities.CustomerTransactions;


@Repository
public interface CustomerTransactionsRepository extends JpaRepository<CustomerTransactions, Long>{

	List<CustomerTransactions> findByCustAcctNum(long custAcctNum);


}
