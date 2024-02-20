package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Role;
import com.app.entities.User;

public interface UserDao extends JpaRepository<User, Long>{
	
	    
	    // Custom query to find users by their first name
	    List<User> findByFirstName(String firstName);
	    
	    // Custom query to find users by their last name
	    List<User> findByLastName(String lastName);
	    
	    // Custom query to find users by their email
	    User findByEmail(String email);
	    
	    // Custom query to find users by their role
	    List<User> findByRole(Role role);
	    
	    // Custom query to find users by their first name and last name
	    List<User> findByFirstNameAndLastName(String firstName, String lastName);
	    
	    // Custom query to check if a user with a specific email exists
	    boolean existsByEmail(String email);
	   

}
