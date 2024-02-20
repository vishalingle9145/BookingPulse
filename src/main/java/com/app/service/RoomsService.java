package com.app.service;

import com.app.dao.RoomsDao;
import com.app.entities.Rooms;
import com.app.entities.RoomType;
import com.app.entities.Hotels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomsService {

    @Autowired
    private RoomsDao roomsDao;

    public List<Rooms> getAllRooms() {
        return roomsDao.findAll();
    }

    public Rooms getRoomById(Long id) {
        return roomsDao.findById(id).orElse(null);
    }

    public List<Rooms> getRoomsByType(RoomType roomType) {
        return roomsDao.findByRoomType(roomType);
    }

    public List<Rooms> getRoomsByStatus(boolean status) {
        return roomsDao.findByStatus(status);
    }

    public List<Rooms> getRoomsByRateLessThan(double rate) {
        return roomsDao.findByRateLessThan(rate);
    }

    public List<Rooms> getRoomsByRateGreaterThan(double rate) {
        return roomsDao.findByRateGreaterThan(rate);
    }

    public List<Rooms> getRoomsByHotel(Hotels hotels) {
        return roomsDao.findByHotels(hotels);
    }

    public Rooms saveOrUpdateRoom(Rooms room) {
        return roomsDao.save(room);
    }

    public void deleteRoom(Long id) {
        roomsDao.deleteById(id);
    }
}
