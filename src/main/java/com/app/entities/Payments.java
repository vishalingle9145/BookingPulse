package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Payments extends BaseEntity{
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "booking_id")
	private Bookings bookings;
	
	private double amount;
	@Column(name = "time_stamp")
	private LocalDate timeStamp;
	
	
	

}
