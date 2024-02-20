package com.app.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Hotels extends BaseEntity {

	@Column(name = "hotel_name")
	private String hotelName;
	private String city;
	private String email;
	@Column(name = "phone_no")
	private String phoneNo;
	private int rating;

	@OneToMany(mappedBy = "hotels")
	private List<Rooms> rooms;

	@OneToMany(mappedBy = "hotels")
	private List<Bookings> bookings;
	
	
	
}
