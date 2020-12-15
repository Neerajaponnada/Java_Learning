package com.wellsfargo.batch7.group3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.group3.entities.KycDetails;

@Repository
public interface AdminRepository extends JpaRepository<KycDetails, Long>{

	boolean existsByMobileNum(String mobileNum);

	boolean existsByUserName(String userName);

	List<KycDetails> findAllByKycApprovalStatus(String status);


}
