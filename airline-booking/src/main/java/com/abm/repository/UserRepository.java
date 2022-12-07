
  package com.abm.repository;
  
  import org.springframework.data.jpa.repository.Query; import
  org.springframework.data.repository.CrudRepository;
  
  import com.abm.entity.User;
  
  
  public interface UserRepository extends CrudRepository<User, Integer>{
  
  
  
  @Query("select count(u) from User u where u.email= ?1 and u.password =?2")
  public long verifyByEmailPass(String email, String password);
  
  
	/*
	 * @Query("select  u.fullName from User u where u.email =?1") public String
	 * getFullName(String email);
	 */
  }
 