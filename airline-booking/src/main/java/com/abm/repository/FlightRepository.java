package com.abm.repository;

import org.springframework.data.repository.CrudRepository;

import com.abm.entity.Flight;

public interface FlightRepository extends CrudRepository<Flight, Integer>{

}
