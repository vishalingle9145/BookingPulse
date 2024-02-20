package com.app.service;

import com.app.dao.BookingsDao;
import com.app.entities.Bookings;
import com.app.entities.Hotels;
import com.app.entities.Rooms;
import com.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookingsService {

    @Autowired
    private BookingsDao bookingsDao;

    public List<Bookings> getAllBookings() {
        return bookingsDao.findAll();
    }

    public Optional<Bookings> getBookingById(Long id) {
        return bookingsDao.findById(id);
    }

    public List<Bookings> getBookingsByHotel(Hotels hotels) {
        return bookingsDao.findByHotels(hotels);
    }

    public List<Bookings> getBookingsByUser(User user) {
        return bookingsDao.findByUser(user);
    }

    public List<Bookings> getBookingsByRoom(Rooms rooms) {
        return bookingsDao.findByRooms(rooms);
    }

    public List<Bookings> getBookingsByCheckInDate(LocalDate checkInDate) {
        return bookingsDao.findByCheckInDate(checkInDate);
    }

    public List<Bookings> getBookingsByCheckOutDate(LocalDate checkOutDate) {
        return bookingsDao.findByCheckOutDate(checkOutDate);
    }

    public Bookings saveOrUpdateBooking(Bookings booking) {
        return bookingsDao.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingsDao.deleteById(id);
    }
}
