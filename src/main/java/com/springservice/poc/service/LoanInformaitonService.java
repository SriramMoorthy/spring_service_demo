package com.springservice.poc.service;

import com.springservice.poc.model.LoanInformation;

/** 
 * This component is the service API for LoanInformation
 * @author Sriram Moorthy
*/

public interface LoanInformaitonService {

	LoanInformation getLoanDetails(String loanId);
	
}
