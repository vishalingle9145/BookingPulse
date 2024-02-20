package com.app.controller;

import com.app.entities.Rooms;
import com.app.entities.RoomType;
import com.app.entities.Hotels;
import com.app.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomsController {

    @Autowired
    private RoomsService roomsService;

    @GetMapping("/all")
    public List<Rooms> getAllRooms() {
        return roomsService.getAllRooms();
    }

    @GetMapping("/{id}")
    public Rooms getRoomById(@PathVariable Long id) {
        return roomsService.getRoomById(id);
    }

    @GetMapping("/type/{roomType}")
    public List<Rooms> getRoomsByType(@PathVariable RoomType roomType) {
        return roomsService.getRoomsByType(roomType);
    }

    @GetMapping("/status/{status}")
    public List<Rooms> getRoomsByStatus(@PathVariable boolean status) {
        return roomsService.getRoomsByStatus(status);
    }

    @GetMapping("/rate-less-than/{rate}")
    public List<Rooms> getRoomsByRateLessThan(@PathVariable double rate) {
        return roomsService.getRoomsByRateLessThan(rate);
    }

    @GetMapping("/rate-greater-than/{rate}")
    public List<Rooms> getRoomsByRateGreaterThan(@PathVariable double rate) {
        return roomsService.getRoomsByRateGreaterThan(rate);
    }

    @GetMapping("/hotel/{hotelId}")
    public List<Rooms> getRoomsByHotel(@PathVariable Long hotelId) {
        Hotels hotels = new Hotels();
        hotels.setId(hotelId);
        return roomsService.getRoomsByHotel(hotels);
    }

    @PostMapping("/add")
    public Rooms addRoom(@RequestBody Rooms room) {
        return roomsService.saveOrUpdateRoom(room);
    }

    @PutMapping("/update")
    public Rooms updateRoom(@RequestBody Rooms room) {
        return roomsService.saveOrUpdateRoom(room);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRoom(@PathVariable Long id) {
        roomsService.deleteRoom(id);
    }
}
