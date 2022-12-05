package com.abm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_seat")
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatId;
	
	@Column(name = "seat_name", unique = true)
	private String seatName;
	
	@ManyToOne
	@JoinTable(name = "planeDetailId")
	private PlaneDetail planeDetails;
	
	@OneToOne(mappedBy = "seat")
	private PassengerDetail passengerDetail;

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

/*	public PlaneDetail getPlaneDetails() {
		return planeDetails;
	}

	public void setPlaneDetails(PlaneDetail planeDetails) {
		this.planeDetails = planeDetails;
	}*/
	
}
