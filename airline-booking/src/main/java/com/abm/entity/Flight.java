package com.abm.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	
	@Column(name = "flight_name")
	private String flightName;
	
	@Column(name = "flight_from")
	private String fromAirport;
	
	@Column(name = "flight_to")
	private String toAirport;
	
	@Column(name = "flight_depart")
	private LocalDate depatureDate;
	
	@Column(name = "flight_arrival")
	private LocalDate arrivalDate;
	
	@OneToOne(mappedBy = "flight")
	private PlaneDetail planeDetails;
	
	@OneToOne(mappedBy = "flight")
	Reservation reservations;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(String fromAirport) {
		this.fromAirport = fromAirport;
	}

	public String getToAirport() {
		return toAirport;
	}

	public void setToAirport(String toAirport) {
		this.toAirport = toAirport;
	}

	public LocalDate getDepatureDate() {
		return depatureDate;
	}

	public void setDepatureDate(LocalDate depatureDate) {
		this.depatureDate = depatureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public PlaneDetail getPlaneDetails() {
		return planeDetails;
	}

	public void setPlaneDetails(PlaneDetail planeDetails) {
		this.planeDetails = planeDetails;
	}
	

	
}
