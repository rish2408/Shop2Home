package com.shop2home.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop2home.exceptions.CustomerException;
import com.shop2home.models.Customer;
import com.shop2home.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService cService;

	@PostMapping("/customers")
	public ResponseEntity<Customer> registerCustomer(@Valid @RequestBody Customer customer) throws CustomerException {

		Customer savedCustomer = cService.createCustomer(customer);

		return new ResponseEntity<Customer>(savedCustomer, HttpStatus.CREATED);
	}

	@PutMapping("/customers")
	public ResponseEntity<Customer> updateCustomer(@Valid @RequestBody Customer customer,
			@RequestParam(required = false) String key) throws CustomerException {

		Customer updatedCustomer = cService.updateCustomer(customer, key);

		return new ResponseEntity<Customer>(updatedCustomer, HttpStatus.OK);

	}

}
