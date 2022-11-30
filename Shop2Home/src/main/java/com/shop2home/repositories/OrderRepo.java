package com.shop2home.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop2home.models.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {

	public List<Orders> findBySessionId(String CustomerKey);

	public void deleteBySessionId(String customerKey);

}
