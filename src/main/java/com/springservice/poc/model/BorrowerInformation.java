package com.springservice.poc.model;

import javax.persistence.Entity;

/** 
 * Model component that represent borrower information.
 * @author Sriram Moorthy
*/
@Entity
public class BorrowerInformation {

	String borrowerType;
	String typeOfLoan;
	long loanAmount;
	String subjectPropertyAddress;
	/**
	 * @return the borrowerType
	 */
	public String getBorrowerType() {
		return borrowerType;
	}
	/**
	 * @param borrowerType the borrowerType to set
	 */
	public void setBorrowerType(String borrowerType) {
		this.borrowerType = borrowerType;
	}
	/**
	 * @return the typeOfLoan
	 */
	public String getTypeOfLoan() {
		return typeOfLoan;
	}
	/**
	 * @param typeOfLoan the typeOfLoan to set
	 */
	public void setTypeOfLoan(String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}
	/**
	 * @return the loanAmount
	 */
	public long getLoanAmount() {
		return loanAmount;
	}
	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	/**
	 * @return the subjectPropertyAddress
	 */
	public String getSubjectPropertyAddress() {
		return subjectPropertyAddress;
	}
	/**
	 * @param subjectPropertyAddress the subjectPropertyAddress to set
	 */
	public void setSubjectPropertyAddress(String subjectPropertyAddress) {
		this.subjectPropertyAddress = subjectPropertyAddress;
	}
	
	
}
