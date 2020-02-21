package com.fidelity.portfoliomanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.fidelity.portfoliomanagement.dao.PortfolioModelDAO;
import com.fidelity.portfoliomanagement.entity.Customer;
import com.fidelity.portfoliomanagement.entity.PortfolioModel;
import com.fidelity.portfoliomanagement.exception.CustomerException;
import com.fidelity.portfoliomanagement.model.CustomerPortfolio;
import com.fidelity.portfoliomanagement.utility.DateTimeUtil;

@Service
public class CustomerPortfolioServiceImpl implements CustomerPortfolioService {

	private PortfolioModelDAO portfolioModelDAO;

	@Autowired
	public CustomerPortfolioServiceImpl(PortfolioModelDAO dao) {
		portfolioModelDAO = dao;
	}

	@Override
	public List<CustomerPortfolio> getCustomersPortfolio(Customer[] customers) {

		List<CustomerPortfolio> customersPortfolioList = new ArrayList<CustomerPortfolio>();

		for (Customer customer : customers) {

			// If single Customer data has been sent, validate the customer
			if (customers.length == 1) {
				if (customer == null || StringUtils.isEmpty(customer.getFirstName())
						|| StringUtils.isEmpty(customer.getLastName())
						|| !(DateTimeUtil.getCurrentAge(customer.getDob()) > 0)) {
					// A Bad json input data for customer, send an error message
					throw new CustomerException("Bad json input data for customer has been sent");
				}

			}

			if (customer != null && !StringUtils.isEmpty(customer.getFirstName())
					&& !StringUtils.isEmpty(customer.getLastName())
					&& DateTimeUtil.getCurrentAge(customer.getDob()) > 0) {

				CustomerPortfolio custPortfolio = getCustomerPortfolio(customer);

				if (custPortfolio != null) {
					customersPortfolioList.add(custPortfolio);
				}
			}

		}

		return customersPortfolioList;
	}

	@Override
	public CustomerPortfolio getCustomerPortfolio(Customer customer) {

		List<PortfolioModel> allPortfolioModels = portfolioModelDAO.getAllPortfolioModels();

		int customerAge = DateTimeUtil.getCurrentAge(customer.getDob());

		for (PortfolioModel pfModel : allPortfolioModels) {

			if ((customerAge >= pfModel.getInvestorMinAgeRangeInYrs())
					&& (customerAge <= pfModel.getInvestorMaxAgeRangeInYrs())) {
				CustomerPortfolio custPortfolio = new CustomerPortfolio(customer.getFirstName(), customer.getLastName(),
						pfModel.getModelName());
				return custPortfolio;
			}
		}

		return null;
	}

}
