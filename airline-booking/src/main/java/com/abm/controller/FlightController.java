package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.entity.Flight;
import com.abm.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
@Autowired
private FlightService flightService;
@PostMapping("/add")
public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {
Flight newFlight = flightService.addFlight(flight);
return ResponseEntity.ok(newFlight);
}
}
