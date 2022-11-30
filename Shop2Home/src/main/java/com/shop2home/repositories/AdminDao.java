package com.shop2home.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop2home.models.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {

	Admin findByAdminId(Integer adminId);

}
