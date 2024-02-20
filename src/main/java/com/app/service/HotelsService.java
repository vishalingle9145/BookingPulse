package com.app.service;

import com.app.dao.HotelsDao;
import com.app.entities.Hotels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
