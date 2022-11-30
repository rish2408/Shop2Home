package com.shop2home.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop2home.models.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	public Customer findByEmail(String email);

}
