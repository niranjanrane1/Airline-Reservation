package com.abm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Flight;
import com.abm.repository.FlightAddRepository;


@Service
public class FlightService {
	@Autowired
	private FlightAddRepository flightRepository;

	public Flight addFlight(Flight flight) {
		return flightRepository.save(flight);
	}
}