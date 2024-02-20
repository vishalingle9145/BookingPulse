package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	@JsonIgnore
	@OneToMany(mappedBy = "hotels", cascade = CascadeType.ALL)
	private List<Rooms> rooms;

	@JsonIgnore
	@OneToMany(mappedBy = "hotels", cascade = CascadeType.ALL)
	private List<Bookings> bookings;

}
