package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.HotelsDao;
import com.app.entities.Hotels;

@Service
public class HotelsService {

	@Autowired
	private HotelsDao hotelsDao;

	public List<Hotels> getAllHotels() {
		return hotelsDao.findAll();
	}

	public Hotels getHotelById(Long id) {
		return hotelsDao.findById(id).orElse(null);
	}

	public Hotels createHotel(Hotels hotels) {
		return hotelsDao.save(hotels);
	}

	public Hotels updateHotel(Long hotelId, Hotels hotels) {
		if (hotelsDao.existsById(hotelId)) {
			hotels.setId(hotelId);
			return hotelsDao.save(hotels);
		} else {
			return null;
		}
	}

	public void deleteHotel(Long hotelId) {
		hotelsDao.deleteById(hotelId);
	}

	public List<Hotels> getHotelsByName(String hotelName) {
		return hotelsDao.findByHotelName(hotelName);
	}

	public List<Hotels> getHotelsByCity(String city) {
		return hotelsDao.findByCity(city);
	}

	public List<Hotels> getHotelsByRating(int rating) {
		return hotelsDao.findByRating(rating);
	}

//    public List<Hotels> getHotelsWithAvailableRooms() {
//        return hotelsDao.findHotelsWithAvailableRooms();
//    }
}
