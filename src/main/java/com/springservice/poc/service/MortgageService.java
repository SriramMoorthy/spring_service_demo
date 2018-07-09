package com.springservice.poc.service;

import com.springservice.poc.model.MortgageInformation;

public interface MortgageService {
	
	MortgageInformation getMortgageDetails(String loanId);

}
