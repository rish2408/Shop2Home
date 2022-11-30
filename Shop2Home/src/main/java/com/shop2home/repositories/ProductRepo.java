package com.shop2home.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop2home.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	public List<Product> findByProductName(String name);

	public List<Product> findByProductId(String type);

}
