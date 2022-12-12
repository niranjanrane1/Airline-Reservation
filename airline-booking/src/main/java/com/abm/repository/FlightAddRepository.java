package com.abm.repository;

import org.springframework.data.repository.CrudRepository;

import com.abm.entity.Flight;

public interface FlightAddRepository extends  CrudRepository<Flight, Integer>{

}
