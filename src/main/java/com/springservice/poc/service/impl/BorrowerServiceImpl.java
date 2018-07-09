package com.springservice.poc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springservice.poc.jpa.BorrowerRepository;
import com.springservice.poc.model.BorrowerInformation;
import com.springservice.poc.service.BorrowerService;

@Component
public class BorrowerServiceImpl implements BorrowerService{
	
	@Autowired
	BorrowerRepository borrowerRepository;
	
	@Override
	public BorrowerInformation getBorrowerDetails(String loanId) {
		return borrowerRepository.findBorrowerByLoanId(loanId);
	}

	public void saveBorrowerDetails(BorrowerInformation borrowerInformation) {
		borrowerRepository.save(borrowerInformation);
	}
	
}
