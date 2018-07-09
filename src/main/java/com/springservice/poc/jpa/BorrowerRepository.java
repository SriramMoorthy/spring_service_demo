package com.springservice.poc.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springservice.poc.model.BorrowerInformation;

/** 
 * This component persists borrower information in the database.
 * @author Sriram Moorthy
*/
@Component
public interface BorrowerRepository extends JpaRepository<BorrowerInformation, Long>{

	BorrowerInformation findBorrowerByLoanId(String loanId);

}
