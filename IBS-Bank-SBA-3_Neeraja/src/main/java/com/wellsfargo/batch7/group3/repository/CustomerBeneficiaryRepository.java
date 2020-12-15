package com.wellsfargo.batch7.group3.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.group3.entities.CustomerBeneficiary;


@Repository
public interface CustomerBeneficiaryRepository extends JpaRepository<CustomerBeneficiary, Long>{

	List<CustomerBeneficiary> findByCustAcctNum(long custAcctNum);


	//List<CustomerBeneficiary> findByUserName(String userName);


}
