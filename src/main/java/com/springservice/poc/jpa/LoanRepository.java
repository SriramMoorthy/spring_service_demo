package com.springservice.poc.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springservice.poc.model.LoanInformation;

/** 
 * This component persists loan information in the database.
 * @author Sriram Moorthy
*/
@Component
public interface LoanRepository extends JpaRepository<LoanInformation, String>{

	LoanInformation findLoanInfoByLoanId(String loanId);

}
