package com.fidelity.portfoliomanagement.dao;

import java.util.List;

import com.fidelity.portfoliomanagement.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getAllCustomers();
	public void addCustomer(Customer c);
}
