//Writer Pritam Rajendra Chaphekar. 09/12/2022

package com.abm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.abm.entity.User;
import com.abm.repository.UserRepository;

@Transactional
@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public boolean verifyUser(String email, String password) {

		long count = userRepo.verifyByEmailPass(email, password); // 1 or 2

		if (count == 1L) {
			// some condition to fetch full name of user
			// String fullName = userRepo.getFullName(email);
			
			return true;

		} else {
			return false;
		}
	}

	public User verifyUserData(String email, String password) {
		User user = userRepo.getUserData(email, password);
		if (user != null) {
			return user;
		} else {
			throw new UserNotFoundException("Invalid login credentials...");
		}
	}
	/*
	 * public void register(User user) { userRepo.save(user); }
	 */

	public void register(User user) { 
		  userRepo.save(user); 
	}

	// Forgot password logic start from below
	/*
	 * public void updateResetPasswordToken(String token, String email) throws
	 * UserNotFoundException { User user = userRepo.findByEmail(email);
	 * 
	 * if (user != null) { user.setResetPasswordToken(token); userRepo.save(user); }
	 * else { throw new
	 * UserNotFoundException("Could not find any customer with email " + email);
	 * 
	 * } }
	 * 
	 * public User get(String resetPasswordToken) { return
	 * userRepo.findByResetPasswordToken(resetPasswordToken); } public void
	 * updatePassword(User user, String newPassword) { BCryptPasswordEncoder
	 * passwordEncoder = new BCryptPasswordEncoder(); String encodedPassword =
	 * passwordEncoder.encode(newPassword);
	 * 
	 * user.setPassword(encodedPassword); user.setResetPasswordToken(null);
	 * 
	 * 
	 * userRepo.save(user); }
	 */
}
