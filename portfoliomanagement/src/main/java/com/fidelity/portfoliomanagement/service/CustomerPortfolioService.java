package com.fidelity.portfoliomanagement.service;

import java.util.List;

import com.fidelity.portfoliomanagement.entity.Customer;
import com.fidelity.portfoliomanagement.model.CustomerPortfolio;

public interface CustomerPortfolioService {
	
	//public List<CustomerPortfolio> getCustomersPortfolio(List<Customer> customers);
	public List<CustomerPortfolio> getCustomersPortfolio(Customer[] customers);
	public CustomerPortfolio getCustomerPortfolio(Customer customer);

}
