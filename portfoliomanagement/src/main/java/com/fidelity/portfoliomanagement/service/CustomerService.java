package com.fidelity.portfoliomanagement.service;

import java.util.List;

import com.fidelity.portfoliomanagement.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public void addCustomer(Customer c);
	
}
