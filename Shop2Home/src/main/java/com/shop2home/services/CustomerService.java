package com.shop2home.services;

import java.util.List;

import com.shop2home.exceptions.AdminException;
import com.shop2home.exceptions.CustomerException;
import com.shop2home.models.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer) throws CustomerException;

	public Customer updateCustomer(Customer customer, String key) throws CustomerException;

	public String deleteCustomerById(Integer customerId) throws CustomerException;

	public List<Customer> getAllCustomersDeatils(String key) throws CustomerException, AdminException;

}
