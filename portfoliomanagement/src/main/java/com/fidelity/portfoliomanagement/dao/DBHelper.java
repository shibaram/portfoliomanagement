package com.fidelity.portfoliomanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fidelity.portfoliomanagement.entity.Customer;
import com.fidelity.portfoliomanagement.entity.PortfolioModel;
import com.fidelity.portfoliomanagement.utility.DateTimeUtil;

@Service
public class DBHelper {
	
	private static volatile List<Customer> customersDbData = new ArrayList<Customer>();
	private static volatile List<PortfolioModel> portfolioModelsDbData = new ArrayList<PortfolioModel>();
	static {
		
		Customer customer1 = new Customer("Mark", "Dupire", "07/15/1975", 750000.0); 
		Customer customer2 = new Customer("Marrie", "Gold", "07/15/1955", 880000.0); 
		Customer customer3 = new Customer("Bhanu", "Roy", "07/15/1988", 520000.0); 
		
		customersDbData.add(customer1);
		customersDbData.add(customer2);
		customersDbData.add(customer3);
		
		PortfolioModel pModel1 = new PortfolioModel("Aggressive Growth", 80, 10, 10, 0, 40);
		PortfolioModel pModel2 = new PortfolioModel("Growth", 70, 20, 10, 41, 55);
		PortfolioModel pModel3 = new PortfolioModel("Income", 50, 30, 20, 56, 65);
		PortfolioModel pModel4 = new PortfolioModel("Retirement", 20, 30, 50, 66, 150);
		
		portfolioModelsDbData.add(pModel1);
		portfolioModelsDbData.add(pModel2);
		portfolioModelsDbData.add(pModel3);
		portfolioModelsDbData.add(pModel4);
	}
	
	DBHelper(){
		
	}
	
	public static List<Customer> getAllCustomersFromDb(){
		return customersDbData;
	}
	
	public void addCustomerToDb(Customer c) {
		Object lockOnObj1 = new Object();
		
		if(c != null) {
			synchronized(lockOnObj1){
				customersDbData.add(c);
			}
		}
		lockOnObj1 = null;
	}
	
	public static List<PortfolioModel> getAllPortfolioModelsFromDb(){
		return portfolioModelsDbData;
	}
	
	public void addPortfolioModelToDb(PortfolioModel model) {
		Object lockOnObj1 = new Object();
		
		if(model != null) {
			synchronized(lockOnObj1){
				portfolioModelsDbData.add(model);
			}
		}
		lockOnObj1 = null;
	}

}

