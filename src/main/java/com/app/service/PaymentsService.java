package com.app.service;

import com.app.dao.PaymentsDao;
import com.app.entities.Payments;
import com.app.entities.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentsService {

    @Autowired
    private PaymentsDao paymentsDao;

    public List<Payments> getAllPayments() {
        return paymentsDao.findAll();
    }

    public Optional<Payments> getPaymentById(Long id) {
        return paymentsDao.findById(id);
    }

    public List<Payments> getPaymentsByBooking(Bookings bookings) {
        return paymentsDao.findByBookings(bookings);
    }

    public List<Payments> getPaymentsByAmount(double amount) {
        return paymentsDao.findByAmount(amount);
    }

    public List<Payments> getPaymentsByTimeStamp(LocalDate timeStamp) {
        return paymentsDao.findByTimeStamp(timeStamp);
    }

}
