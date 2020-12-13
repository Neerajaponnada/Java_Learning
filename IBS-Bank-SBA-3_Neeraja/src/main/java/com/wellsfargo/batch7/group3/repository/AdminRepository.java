package com.wellsfargo.batch7.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.group3.entities.KycDetails;

@Repository
public interface AdminRepository extends JpaRepository<KycDetails, Long>{



}
