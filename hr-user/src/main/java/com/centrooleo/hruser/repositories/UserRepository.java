package com.centrooleo.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centrooleo.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
