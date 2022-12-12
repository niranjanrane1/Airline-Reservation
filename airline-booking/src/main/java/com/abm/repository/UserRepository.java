//Writer Pritam Rajendra Chaphekar. 09/12/2022

package com.abm.repository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.abm.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select count(u) from User u where u.email= ?1 and u.password =?2")
	public long verifyByEmailPass(String email, String password);

	@Query("select u from User u Where u.email =?1")
	public User findByEmail(String email);

	/*
	 * @Query("select  u.fullName from User u where u.email =?1") public String
	 * getFullName(String email);
	 */

	@Query("select u from User u where u.email= ?1 and u.password = ?2")
	public User getUserData(String email, String password);

	public User findByResetPasswordToken(String token);

}
