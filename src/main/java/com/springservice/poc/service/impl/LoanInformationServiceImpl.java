package com.springservice.poc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springservice.poc.jpa.LoanRepository;
import com.springservice.poc.model.LoanInformation;
import com.springservice.poc.service.LoanInformaitonService;

/** 
 * This component is the service implementation for the LoanInformationService.
 * @author Sriram Moorthy
*/

@Component
public class LoanInformationServiceImpl implements LoanInformaitonService{
	
	@Autowired
	LoanRepository loanRepository;

	public LoanInformation saveLoanInformation(LoanInformation loanInformation) {
		return loanRepository.save(loanInformation);
	}

	@Override
	public LoanInformation getLoanDetails(String loanId) {
		return loanRepository.findLoanInfoByLoanId(loanId);
	}
	
}
	