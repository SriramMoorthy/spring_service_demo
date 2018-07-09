package com.springservice.poc.service;

import com.springservice.poc.model.BorrowerInformation;

/** 
 * This component is the service API for BorrowerInformation
 * @author Sriram Moorthy
*/

public interface BorrowerService {
	
	BorrowerInformation getBorrowerDetails(String loanId);
}
