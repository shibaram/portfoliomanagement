package com.fidelity.portfoliomanagement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.portfoliomanagement.dao.CustomerDAO;
import com.fidelity.portfoliomanagement.entity.Customer;
import com.fidelity.portfoliomanagement.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	private CustomerService customerService;
	
	@Autowired
	public CustomerRestController(CustomerService service) {
		customerService = service;
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}

}
