package com.shop2home.services;

import com.shop2home.exceptions.CustomerException;
import com.shop2home.exceptions.InsufficientQuantity;
import com.shop2home.exceptions.OrderException;

import com.shop2home.exceptions.ProductNotFoundException;
import com.shop2home.models.CartDto;
import com.shop2home.models.Orders;

public interface OrderService {

	public Orders buyProductByProductId(String sessionId, Integer productId, String productName, Integer quantity)
			throws CustomerException, ProductNotFoundException, InsufficientQuantity;

	public CartDto visitYourCart(String customerKey) throws CustomerException, OrderException;

	public String payAmount(String customerKey, Double amount) throws CustomerException, OrderException;

	public Orders deleteProductByOrderId(String customerKey, Integer orderId) throws CustomerException, OrderException;

}
