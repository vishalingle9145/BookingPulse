package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Bookings;
import com.app.entities.Hotels;
import com.app.entities.Rooms;
import com.app.entities.User;

public interface BookingsDao extends JpaRepository<Bookings, Long> {

	// Custom query to find bookings by the hotel they belong to
	List<Bookings> findByHotels(Hotels hotels);

	// Custom query to find bookings by the user who made the booking
	List<Bookings> findByUser(User user);

	// Custom query to find bookings by the room booked
	List<Bookings> findByRooms(Rooms rooms);

	// Custom query to find bookings by the check-in date
	List<Bookings> findByCheckInDate(LocalDate checkInDate);

	// Custom query to find bookings by the check-out date
	List<Bookings> findByCheckOutDate(LocalDate checkOutDate);

}
