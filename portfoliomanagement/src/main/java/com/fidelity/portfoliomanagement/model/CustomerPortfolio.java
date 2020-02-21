package com.fidelity.portfoliomanagement.model;


public class CustomerPortfolio {
	
	private String firstName;
	private String lastName;
	private String portfolioModelName;
	
	public CustomerPortfolio(String firstName, String lastName, String portfolioModelName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.portfolioModelName = portfolioModelName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPortfolioModelName() {
		return portfolioModelName;
	}

	public void setPortfolioModelName(String portfolioModelName) {
		this.portfolioModelName = portfolioModelName;
	}
	
}
