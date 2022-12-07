
  package com.abm.service;
  
  import javax.transaction.Transactional;
  
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.User;
import com.abm.repository.UserRepository;
  
  
  @Transactional 
  @Service
  public class UserService {
  
  @Autowired UserRepository userRepo;
  
  public boolean verifyUser(String email, String password) {
  
  long count = userRepo.verifyByEmailPass(email, password);          // 1 or 2
  
  if( count == 1L) { 
	  //some condition to fetch full name of user
	 // String fullName = userRepo.getFullName(email);
	  return true;
	 
  } 
     else {
	  return false;
	  }
  
  
  }
  
  public void register(User user) {
	  
	  userRepo.save(user);
  }
  
  }
  
 