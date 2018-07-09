package com.springservice.poc.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springservice.poc.model.Users;

/** 
 * This component persists user information in the database.
 * @author Sriram Moorthy
*/
@Component
public interface UserRepository extends JpaRepository<Users, Long>{

	Users findByName(String name);

}
