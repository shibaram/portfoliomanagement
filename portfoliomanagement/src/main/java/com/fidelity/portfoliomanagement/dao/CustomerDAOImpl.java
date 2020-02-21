package com.fidelity.portfoliomanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fidelity.portfoliomanagement.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	DBHelper dbHelper;

	@Override
	public List<Customer> getAllCustomers() {

		
		return DBHelper.getAllCustomersFromDb();
	}
	
	@Override
	public void addCustomer(Customer c) {
		dbHelper.addCustomerToDb(c);
	}

}
