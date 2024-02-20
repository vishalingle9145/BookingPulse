package com.app.controller;

import com.app.entities.Payments;
import com.app.entities.Bookings;
import com.app.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentsController {

    @Autowired
    private PaymentsService paymentsService;

    @GetMapping("/all")
    public List<Payments> getAllPayments() {
        return paymentsService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Optional<Payments> getPaymentById(@PathVariable Long id) {
        return paymentsService.getPaymentById(id);
    }

    @GetMapping("/booking/{bookingId}")
    public List<Payments> getPaymentsByBooking(@PathVariable Long bookingId) {
        Bookings bookings = new Bookings();
        bookings.setId(bookingId);
        return paymentsService.getPaymentsByBooking(bookings);
    }

    @GetMapping("/amount/{amount}")
    public List<Payments> getPaymentsByAmount(@PathVariable double amount) {
        return paymentsService.getPaymentsByAmount(amount);
    }

    @GetMapping("/timestamp/{timeStamp}")
    public List<Payments> getPaymentsByTimeStamp(@PathVariable LocalDate timeStamp) {
        return paymentsService.getPaymentsByTimeStamp(timeStamp);
    }

}
