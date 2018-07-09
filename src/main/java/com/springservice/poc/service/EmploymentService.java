package com.springservice.poc.service;

import com.springservice.poc.model.EmploymentInformation;

/** 
 * This component is the service API for EmploymentInformation
 * @author Sriram Moorthy
*/

public interface EmploymentService {

	EmploymentInformation getEmploymentDetails(String loanId);
}
