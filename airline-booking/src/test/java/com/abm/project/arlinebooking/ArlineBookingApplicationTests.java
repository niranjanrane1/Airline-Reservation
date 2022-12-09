
  package com.abm.project.arlinebooking;
  
  import org.junit.jupiter.api.Test; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.test.context.SpringBootTest;
  
  import com.abm.entity.User; import com.abm.repository.UserRepository;
  
  @SpringBootTest class ArlineBookingApplicationTests {
  
  @Autowired UserRepository userRepo;
  
  @Test void addUser() {
  
  User admin = new User(); 
  admin.setFullName("Pritam Patil");
  admin.setAdmin(true); 
  admin.setTitle("Mr.");
  admin.setEmail("pritamchaphekar58@gmail"); 
  admin.setPassword("Pass@12345");
  admin.setWallet(53000.0); 
  userRepo.save(admin);
  
  
  }
  
  }
 