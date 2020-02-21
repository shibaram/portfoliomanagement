package com.fidelity.portfoliomanagement.entity;

//@Entity
//@Table("")
public class PortfolioModel {
	
	private String modelName;
	private Integer equityInPercentage;
	private Integer bondsInPercentage; 
	private Integer cashInPercentage;
	private Integer investorMinAgeRangeInYrs;
	private Integer investorMaxAgeRangeInYrs;
	
	public PortfolioModel() {
		
	}
	
	public PortfolioModel(String modelName, Integer equityInPercentage, Integer bondsInPercentage,
			Integer cashInPercentage, Integer investorMinAgeRangeInYrs, Integer investorMaxAgeRangeInYrs) {
		
		this.modelName = modelName;
		this.equityInPercentage = equityInPercentage;
		this.bondsInPercentage = bondsInPercentage;
		this.cashInPercentage = cashInPercentage;
		this.investorMinAgeRangeInYrs = investorMinAgeRangeInYrs;
		this.investorMaxAgeRangeInYrs = investorMaxAgeRangeInYrs;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getEquityInPercentage() {
		return equityInPercentage;
	}

	public void setEquityInPercentage(Integer equityInPercentage) {
		this.equityInPercentage = equityInPercentage;
	}

	public Integer getBondsInPercentage() {
		return bondsInPercentage;
	}

	public void setBondsInPercentage(Integer bondsInPercentage) {
		this.bondsInPercentage = bondsInPercentage;
	}

	public Integer getCashInPercentage() {
		return cashInPercentage;
	}

	public void setCashInPercentage(Integer cashInPercentage) {
		this.cashInPercentage = cashInPercentage;
	}

	public Integer getInvestorMinAgeRangeInYrs() {
		return investorMinAgeRangeInYrs;
	}

	public void setInvestorMinAgeRangeInYrs(Integer investorMinAgeRangeInYrs) {
		this.investorMinAgeRangeInYrs = investorMinAgeRangeInYrs;
	}

	public Integer getInvestorMaxAgeRangeInYrs() {
		return investorMaxAgeRangeInYrs;
	}

	public void setInvestorMaxAgeRangeInYrs(Integer investorMaxAgeRangeInYrs) {
		this.investorMaxAgeRangeInYrs = investorMaxAgeRangeInYrs;
	} 
	

}
