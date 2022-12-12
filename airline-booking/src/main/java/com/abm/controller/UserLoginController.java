//Writer Pritam Rajendra Chaphekar.

package com.abm.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.abm.entity.User;
import com.abm.service.UserNotFoundException;
import com.abm.service.UserService;

@Controller
public class UserLoginController {

	
	  @RequestMapping("/") 
	  public String home() {
	  System.out.println("this is home page");
	  
	  return "userlogin";
	  }
	 

	@Autowired
	private UserService userService;

	/*
	 * @RequestMapping(value = "/loginVerification") public String
	 * loginVerification(ModelMap model, @RequestParam String
	 * userEmail, @RequestParam String userPassword) {
	 * 
	 * boolean verified = userService.verifyUser(userEmail, userPassword);
	 * 
	 * if (verified) {
	 * 
	 * // model.put("userEmail",userEmail); // HttpSession hs = new HttpSession();
	 * return "success"; } else { model.put("errorMessage", "Invalid Credentials");
	 * return "failure";
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public String
	 * showLoginPage(ModelMap model) { return "userlogin";
	 * 
	 * }
	 */
	
	
	@RequestMapping("/userlogin")
    public String verifyUserLogin(User user, HttpSession session) {
        try {
            user = userService.verifyUserData(user.getEmail(), user.getPassword());
            session.setAttribute("user", user);
            session.setAttribute("userName", user.getFullName());
            if(user.isAdmin())
            	return "AdminAddFlight";
            else
            	return "FlightSearch";
        } catch (UserNotFoundException userException) {
            return "failure";
        }
    }
	@RequestMapping("/registration")
	public String register() {
		
		return "Registration";
	}
	
	 @RequestMapping(value="/register", method= RequestMethod.POST)
	 public String showRegisterPage(User user) {
		 userService.register(user);
		 
		 
		 return "userlogin";
		 
	 }
	
	@RequestMapping("/userLogout")
    public String userLogOut(HttpServletRequest request, HttpSession session) {
        session = request.getSession(false);
        if (session == null) {
            return "sessionExpired";
        } else {
            session.invalidate();      // Session object is destroyed
            return "LogoutSuccess";
        }
    }

}
