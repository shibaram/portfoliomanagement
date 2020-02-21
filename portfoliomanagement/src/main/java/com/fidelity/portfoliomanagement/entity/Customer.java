package com.fidelity.portfoliomanagement.entity;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Customer")
*/
public class Customer {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY)
	 */
	//private Integer customerId; 
	private String firstName;
	private String lastName;
	
	private String dob;
	private Double asset;
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, String dob, Double asset) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.asset = asset;
	}
	
	/*
	 * public Integer getCustomerId() { return customerId; }
	 * 
	 * public void setCustomerId(Integer customerId) { this.customerId = customerId;
	 * }
	 */

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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Double getAsset() {
		return asset;
	}

	public void setAsset(Double asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", asset=" + asset
				+ "]";
	}
	
	
}
