package com.fidelity.portfoliomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fidelity.portfoliomanagement.dao.CustomerDAO;
import com.fidelity.portfoliomanagement.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDAO customerDao;
	
	@Autowired
	public CustomerServiceImpl(CustomerDAO dao) {
		customerDao = dao;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerDao.getAllCustomers();
	}
	
	@Override
	public void addCustomer(Customer c) {
		customerDao.addCustomer(c);
	}

}
