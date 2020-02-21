package com.fidelity.portfoliomanagement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.portfoliomanagement.dao.PortfolioModelDAO;
import com.fidelity.portfoliomanagement.entity.PortfolioModel;

@RestController
@RequestMapping("/api")
public class PortfolioModelRestController {
	
	private PortfolioModelDAO portfolioModelDAO;
	
	@Autowired
	public PortfolioModelRestController(PortfolioModelDAO dao) {
		portfolioModelDAO = dao;
	}
	
	@GetMapping("/portfoliomodels")
	public List<PortfolioModel> getAllCustomers(){
		return portfolioModelDAO.getAllPortfolioModels();
	}

}
