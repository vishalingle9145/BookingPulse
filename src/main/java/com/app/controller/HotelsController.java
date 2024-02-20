package com.app.controller;

import com.app.entities.Hotels;
import com.app.service.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelsController {

    @Autowired
    private HotelsService hotelsService;

    @GetMapping("/all")
    public List<Hotels> getAllHotels() {
        return hotelsService.getAllHotels();
    }

    @GetMapping("/{id}")
    public Hotels getHotelById(@PathVariable Long id) {
        return hotelsService.getHotelById(id);
    }

    @GetMapping("/name/{hotelName}")
    public List<Hotels> getHotelsByName(@PathVariable String hotelName) {
        return hotelsService.getHotelsByName(hotelName);
    }

    @GetMapping("/city/{city}")
    public List<Hotels> getHotelsByCity(@PathVariable String city) {
        return hotelsService.getHotelsByCity(city);
    }

    @GetMapping("/rating/{rating}")
    public List<Hotels> getHotelsByRating(@PathVariable int rating) {
        return hotelsService.getHotelsByRating(rating);
    }

//    @GetMapping("/available-rooms")
//    public List<Hotels> getHotelsWithAvailableRooms() {
//        return hotelsService.getHotelsWithAvailableRooms();
//    }
}
