package com.bel.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bel.training.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
