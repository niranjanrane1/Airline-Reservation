package com.abm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abm.entity.PassengerDetail;
import com.abm.service.PassengerDetailService;

@Controller
public class PassengerDetailController {
	
	@Autowired
	PassengerDetailService passengerService;
	
	@RequestMapping("/addPassengerDetails")
	public String addPassengerDetails(@RequestParam String name, @RequestParam String phoneNumber, @RequestParam String passportNo,Map<String, Object> model) {
		
		PassengerDetail passengerDetails = new PassengerDetail();
		passengerDetails.setName(name);
		passengerDetails.setPassportNo(passportNo);
		passengerDetails.setPhoneNumber(Long.parseLong(phoneNumber));
		
		//passengerService.addAllPassengers(passengerDetails);
		int pnr = passengerService.addAllPassengers(passengerDetails);
		
		model.put("PNR", pnr);
		return "pnr";
	}
}
