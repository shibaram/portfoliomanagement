package com.fidelity.portfoliomanagement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.portfoliomanagement.entity.Customer;
import com.fidelity.portfoliomanagement.exception.CustomerException;
import com.fidelity.portfoliomanagement.model.CustomerErrorResponse;
import com.fidelity.portfoliomanagement.model.CustomerPortfolio;
import com.fidelity.portfoliomanagement.service.CustomerPortfolioService;

@RestController
@RequestMapping("/api")
public class CustomerPortfolioController {
	
private CustomerPortfolioService customerPortfolioService;
	
	@Autowired
	public CustomerPortfolioController(CustomerPortfolioService service) {
		customerPortfolioService = service;
	}
	
	@PostMapping("/customersPortfolio")
	public List<CustomerPortfolio> getAllCustomers(@RequestBody Customer[] customers){
		return customerPortfolioService.getCustomersPortfolio(customers);
	}
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerException e) {
		
		CustomerErrorResponse errorRes = new CustomerErrorResponse();
		
		errorRes.setStatus(HttpStatus.BAD_REQUEST.value());
		errorRes.setErrorMessage(e.getMessage());
		errorRes.setTimeStamp(System.currentTimeMillis());
		
		
		return new ResponseEntity<CustomerErrorResponse>(errorRes, HttpStatus.BAD_REQUEST);
		
	}

}
