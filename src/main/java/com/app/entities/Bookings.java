package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Bookings extends BaseEntity{
	
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	
	
	
	
	
}
