package com.springservice.poc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springservice.poc.jpa.EmploymentRepository;
import com.springservice.poc.model.EmploymentInformation;
import com.springservice.poc.service.EmploymentService;

@Component
public class EmploymentServiceImpl implements EmploymentService{

	
	@Autowired
	EmploymentRepository employmentRepository;

	public EmploymentInformation saveLoanInformation(EmploymentInformation employmentInformation) {
		return employmentRepository.save(employmentInformation);
	}

	@Override
	public EmploymentInformation getEmploymentDetails(String loanId) {
		return employmentRepository.findEmploymentInfoByLoanId(loanId);
	}
}
