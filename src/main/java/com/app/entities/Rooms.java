package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Rooms extends BaseEntity {

	@Enumerated(EnumType.STRING)
	@Column(name = "room_type")
	private RoomType roomType;
	private boolean status;
	private double rate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "hotel_id")
	private Hotels hotels;

	@JsonIgnore
	@OneToMany(mappedBy = "rooms", cascade = CascadeType.ALL)
	private List<Bookings> bookings;

}