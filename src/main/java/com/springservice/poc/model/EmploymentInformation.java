package com.springservice.poc.model;

import javax.persistence.Entity;

/** 
 * Model / Entity  component that represent employer information.
 * @author Sriram Moorthy
*/
@Entity
public class EmploymentInformation {

	String employerName;
	int grossPay;
	int yearsOfService;
	int yearsOfExperience;
	
	/**
	 * @return the employerName
	 */
	public String getEmployerName() {
		return employerName;
	}
	/**
	 * @param employerName the employerName to set
	 */
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	/**
	 * @return the grossPay
	 */
	public int getGrossPay() {
		return grossPay;
	}
	/**
	 * @param grossPay the grossPay to set
	 */
	public void setGrossPay(int grossPay) {
		this.grossPay = grossPay;
	}
	/**
	 * @return the yearsOfService
	 */
	public int getYearsOfService() {
		return yearsOfService;
	}
	/**
	 * @param yearsOfService the yearsOfService to set
	 */
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	/**
	 * @return the yearsOfExperience
	 */
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	/**
	 * @param yearsOfExperience the yearsOfExperience to set
	 */
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
}
