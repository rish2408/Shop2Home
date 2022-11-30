package com.shop2home.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop2home.models.CurrentCustomerSession;

public interface CustomerSessionDao extends JpaRepository<CurrentCustomerSession, Integer> {

	public CurrentCustomerSession findByUuid(String uuid);
}
