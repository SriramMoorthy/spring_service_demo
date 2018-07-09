package com.springservice.poc.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springservice.poc.model.EmploymentInformation;

/** 
 * This component persists employment information in the database.
 * @author Sriram Moorthy
*/
@Component
public interface EmploymentRepository extends JpaRepository<EmploymentInformation, String>{

	EmploymentInformation findEmploymentInfoByLoanId(String loanId);


}
