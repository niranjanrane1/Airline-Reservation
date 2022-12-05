package com.abm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tbl_plane_detail")
public class PlaneDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="det_id")
	private int planeDetailId;
	
	@Column(name ="det_flight_name")
	private String flightName;
	
	@Column(name ="det_total_seats")
	private int totalSeats;

	public int getPlaneDetailId() {
		return planeDetailId;
	}

	public void setPlaneDetailId(int planeDetailId) {
		this.planeDetailId = planeDetailId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	@JsonIgnore
	@OneToMany(mappedBy = "planeDetails")
	List<Seat> seat;
	
	
	@OneToOne
	@JoinTable(name = "flightId")
	@JsonIgnore
	private Flight flight;

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	
}
