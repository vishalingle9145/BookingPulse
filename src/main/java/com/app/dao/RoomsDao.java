package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Hotels;
import com.app.entities.RoomType;
import com.app.entities.Rooms;

public interface RoomsDao extends JpaRepository<Rooms, Long> {

	// Custom query to find rooms by their type
	List<Rooms> findByRoomType(RoomType roomType);

	// Custom query to find rooms by their availability status
	List<Rooms> findByStatus(boolean status);

	// Custom query to find rooms by their rate less than a specified value
	List<Rooms> findByRateLessThan(double rate);

	// Custom query to find rooms by their rate greater than a specified value
	List<Rooms> findByRateGreaterThan(double rate);

	// Custom query to find rooms by the hotel they belong to
	List<Rooms> findByHotels(Hotels hotels);

}
