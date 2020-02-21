package com.fidelity.portfoliomanagement.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fidelity.portfoliomanagement.entity.PortfolioModel;

@Repository
public class PortfolioModelDAOImpl implements PortfolioModelDAO{

	@Override
	public List<PortfolioModel> getAllPortfolioModels() {

		
		return DBHelper.getAllPortfolioModelsFromDb();
	}

}
