package com.abm.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abm.entity.User;
import com.abm.repository.UserRepository;
import com.abm.service.UserService;

@Controller
//@RequestMapping("/")
public class UserLoginController {
	
	/*
	 * @RequestMapping("/login") public String home() {
	 * System.out.println("this is home page"); return "success"; }
	 */
	
	@Autowired
	private UserService userService;
	
	 @RequestMapping(value = "/loginVerification") 
	 public String loginVerification(ModelMap model, @RequestParam String userEmail, @RequestParam String userPassword) {
		 
		 boolean verified = userService.verifyUser(userEmail, userPassword);
		 
		 if(verified) {
			 
			 //model.put("userEmail",userEmail);
			 //HttpSession hs = new HttpSession();
			 return "success";
		 }
		 else {
			 model.put("errorMessage", "Invalid Credentials");
			 return "failure";
			 
		 }
		 
	 }
	 
	 @RequestMapping(value="/login", method= RequestMethod.GET)
	 public String showLoginPage(ModelMap model ) {
		 return "userlogin";
		 
	 }
	 
	
	 

}
