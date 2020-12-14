package com.wellsfargo.batch7.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.group3.dto.LoginDataDto;
import com.wellsfargo.batch7.group3.entities.KycDetails;
import com.wellsfargo.batch7.group3.entities.LoginInfo;

@Repository
public interface LoginRepository extends JpaRepository<LoginInfo, Long>{

	boolean existsByUserName(String role);

	LoginInfo findByUserName(String userName);

}
