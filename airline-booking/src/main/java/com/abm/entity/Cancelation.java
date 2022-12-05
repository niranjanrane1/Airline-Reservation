package com.abm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Cancelation {
	
	@Id
	private int cancelationId;
	
	private double amount;

	public int getCancelationId() {
		return cancelationId;
	}

	public void setCancelationId(int cancelationId) {
		this.cancelationId = cancelationId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@OneToOne
	@JoinTable(name = "reservationId")
	private Reservation reservation;
	
	
	
	
}
