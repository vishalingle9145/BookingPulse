package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Rooms extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "id")
	private Hotels hotels;

	@Enumerated(EnumType.STRING)
	private RoomType roomType;
	private boolean status;
	private double rate;

}
