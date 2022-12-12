package com.abm.controller;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.abm.entity.Flight;
import com.abm.service.FlightSearchService;
import com.fasterxml.jackson.annotation.JsonFormat;



@Controller
public class FlightSearchController {
	@Autowired
	FlightSearchService flightSearch;
	
		@RequestMapping("/search")
		@DateTimeFormat(pattern = "yyyy-MM-dd;")
		public String search(Flight flight, @RequestParam("depatureDateId") String date, Map<String, Object> model) {
				
				//CONVERT DATE TO LOCAL DATE(FORMATTER)
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				flight.setDepatureDate(LocalDate.parse(date, formatter));
				
			
			try {
				//List<Flight> flights = flightSearch.search(flight.getArrivalDate(), flight.getFromAirport(), flight.getToAirport()); 
				
				model.put("flightDetails", flightSearch.search(flight.getDepatureDate(), flight.getFromAirport(), flight.getToAirport()));
				/*for(Flight f : flights) {
					System.out.println(f.);
				}*/
				return "FlightDetails";
			}
			catch(Exception e) {
				return "noflightsavailable";
			}
		
		}
		
		@RequestMapping("/reservation")
		public String reserveSeats() {
			return "ReservationInformation";
		}
		
		
		
}
