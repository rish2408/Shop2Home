package com.shop2home.services;

import java.util.List;

import com.shop2home.exceptions.ProductNotFoundException;

import com.shop2home.models.Product;

public interface ProductService {

	public Product addProduct(Product seed) throws ProductNotFoundException;

	public Product updateProduct(Product seed) throws ProductNotFoundException;

	public List<Product> getAllProducts() throws ProductNotFoundException;

	public Product deleteProductById(Integer seedId) throws ProductNotFoundException;

	public Product viewProductById(Integer seedId) throws ProductNotFoundException;

	public List<Product> viewProductByName(String name) throws ProductNotFoundException;

	public Product changeQuantityOfProductByProductId(Integer seedid, Integer newQuantity)
			throws ProductNotFoundException;

	public Product changePriceOfProductByProductId(Integer seedid, Double newPrice) throws ProductNotFoundException;

}
