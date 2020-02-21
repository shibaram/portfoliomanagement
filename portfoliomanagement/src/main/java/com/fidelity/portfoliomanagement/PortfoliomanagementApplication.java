package com.fidelity.portfoliomanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fidelity.portfoliomanagement")
public class PortfoliomanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfoliomanagementApplication.class, args);
	}

}
