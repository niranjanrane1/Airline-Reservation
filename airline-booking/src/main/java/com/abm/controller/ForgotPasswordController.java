//Writer Pritam Rajendra Chaphekar. 09/12/2022

package com.abm.controller;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abm.entity.User;
import com.abm.repository.UserRepository;
import com.abm.service.EmailService;
import com.abm.service.UserNotFoundException;
import com.abm.service.UserService;

import net.bytebuddy.utility.RandomString;




@Controller
public class ForgotPasswordController {
	
	Random random = new Random(1000);
	
	@Autowired
	private EmailService emaliService;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserService userService;
	
	/*
	 * @Autowired private BCryptPasswordEncoder bcrypt;
	 */
	 
	
	@RequestMapping("/forgot_password")
	public String openEmailForm() {
		
		return "forgot_password_form";
		
		
	}
	
	@PostMapping("/send-otp")
	public String sendOTP(@RequestParam("email") String email, HttpSession session) {
		
		System.out.println("EMAIL" +email);
		 
		//generating otp of 4 digit
			
	 int otp =	random.nextInt(999999);
	   
	 System.out.println("OTP " + otp);
	
	//write code for send otp to email
	
	String subject = "OTP From SCM";
	String message= "  " 
	            +"<div style='border:1px solid #e2e2e2; padding:20px'>"
			    + "<h1>"
	            + "OTP is"
			    +"<b>"+otp
			    +"</n>"
			    + "</h1>"
                + "</div>";
	           ;
	String to = email;
	
	boolean flag = this.emaliService.sendEmail(subject, message, to);
	
	if (flag)
	{
		session.setAttribute("myotp", otp);
		session.setAttribute("email", email);
		return "verify_otp";
	} else
		
	  {
		session.setAttribute("message", "Check your email id !!");
		return "forgot_password_form";
	  }
			
  }
	

	@PostMapping("/verify-otp")
    public String verifyOtp(@RequestParam("otp") int otp, HttpSession session ) {
		
		int myOtp = (int)session.getAttribute("myotp");
		String email=(String)session.getAttribute("email");
		if(myOtp==otp) {
			
		      User user= this.userRepo.findByEmail(email);
		  
		  if(user==null) 
		  {
			  //send error 
			  session.setAttribute("eMessage", "User does not exsists");
			  return "forgot_password_form";
			  
		  } else 
		  {
			  
			  
		  }
		  
		  return "password_change_form";
		  
			
		}else 
		{
			
			//session.setAttribute("wMessage", "You have entered wrong otp");
			return "verify_otp";
		}
	
}
	
	//change password
	
	
	  @PostMapping("/change-password") public String
	  changePassword(@RequestParam("newPassword") String newpassword, HttpSession
	  session) {
		 
		  String email=(String)session.getAttribute("email"); 
		  User user= this.userRepo.findByEmail(email); 
		  user.setPassword(newpassword);
		  this.userRepo.save(user);
		 
		  return "userlogin";

	  }
	 
	
}
