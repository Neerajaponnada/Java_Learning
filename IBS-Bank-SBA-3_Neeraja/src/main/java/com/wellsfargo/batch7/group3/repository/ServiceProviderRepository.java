package com.wellsfargo.batch7.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.group3.entities.ServiceProvider;


@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Long>{


}
