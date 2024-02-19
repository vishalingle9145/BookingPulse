package com.app.entities;

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

	private String hotelName;
	private String city;
	private String email;
	private String phoneNo;
	private int rating;

	@OneToMany(mappedBy = "hotels")
	private Rooms rooms;
}
