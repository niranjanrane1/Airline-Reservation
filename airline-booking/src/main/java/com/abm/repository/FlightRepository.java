package com.abm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.abm.entity.Flight;

public interface FlightRepository extends CrudRepository<Flight, Integer>{
	
	@Query("select f from Flight f where f.depatureDate =?1 and f.fromAirport =?2 and f.toAirport =?3")
	public List<Flight> flightByDate(LocalDate depatureDate, String fromAirport, String toAirport);

}
