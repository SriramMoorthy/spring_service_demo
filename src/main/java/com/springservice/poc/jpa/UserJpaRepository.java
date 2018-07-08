package com.springservice.poc.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springservice.poc.model.Users;

@Component
public interface UserJpaRepository extends JpaRepository<Users, Long>{

	Users findByName(String name);

}
