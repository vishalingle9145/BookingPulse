package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Hotels;

public interface HotelsDao extends JpaRepository<Hotels, Long> {

	// Custom query to find hotels by their name
	List<Hotels> findByHotelName(String hotelName);

	// Custom query to find hotels by their city
	List<Hotels> findByCity(String city);

	// Custom query to find hotels by their rating
	List<Hotels> findByRating(int rating);

	// For instance, you can add a method to find hotels with available rooms
//	@Query("SELECT h FROM Hotels h WHERE h.id IN (SELECT r.hotels.id FROM Rooms r WHERE r.available = true)")
//	List<Hotels> findHotelsWithAvailableRooms();

}
