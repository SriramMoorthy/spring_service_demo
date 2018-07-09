package com.springservice.poc.model;

import javax.persistence.Entity;

/** 
 * Model / Entity  component that represents the loan information of an applicant.
 * @author Sriram Moorthy
*/

@Entity
public class LoanInformation {

	String loanInitiationId;
	String loanNo;
	String applicantFirstName;
	String applicantLastName;
	boolean married;
	
	/**
	 * @return the loanInitiationId
	 */
	public String getLoanInitiationId() {
		return loanInitiationId;
	}
	/**
	 * @param loanInitiationId the loanInitiationId to set
	 */
	public void setLoanInitiationId(String loanInitiationId) {
		this.loanInitiationId = loanInitiationId;
	}
	/**
	 * @return the loadNo
	 */
	public String getLoanNo() {
		return loanNo;
	}
	/**
	 * @param loadNo the loadNo to set
	 */
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	/**
	 * @return the applicantFirstName
	 */
	public String getApplicantFirstName() {
		return applicantFirstName;
	}
	/**
	 * @param applicantFirstName the applicantFirstName to set
	 */
	public void setApplicantFirstName(String applicantFirstName) {
		this.applicantFirstName = applicantFirstName;
	}
	/**
	 * @return the applicantLastName
	 */
	public String getApplicantLastName() {
		return applicantLastName;
	}
	/**
	 * @param applicantLastName the applicantLastName to set
	 */
	public void setApplicantLastName(String applicantLastName) {
		this.applicantLastName = applicantLastName;
	}
	/**
	 * @return the married
	 */
	public boolean isMarried() {
		return married;
	}
	/**
	 * @param married the married to set
	 */
	public void setMarried(boolean married) {
		this.married = married;
	}
	
}
