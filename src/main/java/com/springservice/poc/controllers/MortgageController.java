package com.springservice.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springservice.poc.model.MortgageInformation;
import com.springservice.poc.service.MortgageService;

@RestController
public class MortgageController {

	@Autowired
	MortgageService mortgageService;
	
	@GetMapping(value="/{loanId}")
	private MortgageInformation findByName(@PathVariable final String loanId) {
		return mortgageService.getMortgageDetails(loanId);
	}
	
}
