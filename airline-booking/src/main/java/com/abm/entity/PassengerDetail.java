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
@Table(name = "tbl_passenger_detail")
public class PassengerDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerDetailId;
	
	private String name;
	
	private long phoneNumber;
	
	private int pnr;
	
	@OneToOne
	@JoinTable(name = "seatId")
	private Seat seat;
	
	@ManyToOne
	@JoinTable(name = "reservationId")
	private Reservation reservation;
	
	@Column(name = "passport_no")
	private String passportNo;

	public int getPassengerDetailId() {
		return passengerDetailId;
	}

	public void setPassengerDetailId(int passengerDetailId) {
		this.passengerDetailId = passengerDetailId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getPnr() {
		return pnr;
	}


	public void setPnr(int pnr) {
		this.pnr = pnr;
	}


	/*public Seat getSeat() {
		return seat;
	}


	public void setSeat(Seat seat) {
		this.seat = seat;
	}*/


	public String getPassportNo() {
		return passportNo;
	}


	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
	
}
