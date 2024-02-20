package com.app.controller;

import com.app.entities.Bookings;
import com.app.entities.Hotels;
import com.app.entities.Rooms;
import com.app.entities.User;
import com.app.service.BookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bookings")
public class BookingsController {

    @Autowired
    private BookingsService bookingsService;

    @GetMapping("/all")
    public List<Bookings> getAllBookings() {
        return bookingsService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Optional<Bookings> getBookingById(@PathVariable Long id) {
        return bookingsService.getBookingById(id);
    }

    @GetMapping("/hotel/{hotelId}")
    public List<Bookings> getBookingsByHotel(@PathVariable Long hotelId) {
        Hotels hotels = new Hotels();
        hotels.setId(hotelId);
        return bookingsService.getBookingsByHotel(hotels);
    }

    @GetMapping("/user/{userId}")
    public List<Bookings> getBookingsByUser(@PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        return bookingsService.getBookingsByUser(user);
    }

    @GetMapping("/room/{roomId}")
    public List<Bookings> getBookingsByRoom(@PathVariable Long roomId) {
        Rooms rooms = new Rooms();
        rooms.setId(roomId);
        return bookingsService.getBookingsByRoom(rooms);
    }

    @GetMapping("/checkin/{checkInDate}")
    public List<Bookings> getBookingsByCheckInDate(@PathVariable LocalDate checkInDate) {
        return bookingsService.getBookingsByCheckInDate(checkInDate);
    }

    @GetMapping("/checkout/{checkOutDate}")
    public List<Bookings> getBookingsByCheckOutDate(@PathVariable LocalDate checkOutDate) {
        return bookingsService.getBookingsByCheckOutDate(checkOutDate);
    }

    @PostMapping("/add")
    public Bookings addBooking(@RequestBody Bookings booking) {
        return bookingsService.saveOrUpdateBooking(booking);
    }

    @PutMapping("/update")
    public Bookings updateBooking(@RequestBody Bookings booking) {
        return bookingsService.saveOrUpdateBooking(booking);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingsService.deleteBooking(id);
    }
}
