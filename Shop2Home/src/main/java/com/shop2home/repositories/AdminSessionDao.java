package com.shop2home.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop2home.models.CurrentAdminSession;

public interface AdminSessionDao extends JpaRepository<CurrentAdminSession, Integer> {

	public CurrentAdminSession findByUuid(String uuid);
}
