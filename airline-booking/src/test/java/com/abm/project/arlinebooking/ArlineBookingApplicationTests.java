package com.abm.project.arlinebooking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abm.entity.User;
import com.abm.repository.UserRepository;

@SpringBootTest
class ArlineBookingApplicationTests {
	@Autowired
	UserRepository userRepository;
	
	@Test
	void addUsers() {
		User admin = new User();
		
		admin.setFullName("Niranjan Rane");
		admin.setAdmin(true);
		admin.setTitle("Mr.");
		admin.setEmail("niranjan@airline.com");
		admin.setPassword("Pass@123");
		admin.setWallet(50000.0);
		
		userRepository.save(admin);
	}

}
