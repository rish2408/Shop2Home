package com.shop2home.services;

import java.util.List;

import com.shop2home.exceptions.AdminException;
import com.shop2home.exceptions.CustomerException;
import com.shop2home.models.Admin;
import com.shop2home.models.Customer;

public interface AdminService {

	public Customer createCustomer(Customer customer) throws CustomerException;

	public Admin createAdmin(Admin admin) throws AdminException;

	public Admin updateAdmin(Admin admin, String key) throws AdminException;

	public Customer updateCustomer(Customer customer, String key) throws CustomerException;

	public String deleteAdminById(Integer adminId) throws AdminException;

	public List<Admin> getAllAdminDeatils() throws AdminException;

}
