package com.abm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abm.entity.Flight;
import com.abm.repository.FlightRepository;

@Transactional
@Service
public class FlightSearchService {
	@Autowired
	FlightRepository flightRepo;
	public List<Flight> search(LocalDate depatureDate, String fromAirport, String toAirport) {
	
		return flightRepo.flightByDate(depatureDate, fromAirport, toAirport);
	}

}
