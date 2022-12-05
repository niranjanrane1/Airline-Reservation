package com.abm.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int reservationId;
	
	private double totalCost;
	
	@OneToOne
	@JoinTable(name = "flightId")
	private Flight flight;

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	@ManyToOne
	@JoinTable(name = "userId")
	private User user;
	
	@OneToMany(mappedBy = "reservation")
	private List<PassengerDetail> passengerDetails;
	
	@OneToOne(mappedBy = "reservation")
	private Cancelation cancelation; 
	
	
}
