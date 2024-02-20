package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Bookings;
import com.app.entities.Payments;

public interface PaymentsDao extends JpaRepository<Payments, Long>{

	// Custom query to find payments by the booking they are associated with
	List<Payments> findByBookings(Bookings bookings);

	// Custom query to find payments by the amount
	List<Payments> findByAmount(double amount);

	// Custom query to find payments by the time stamp
	List<Payments> findByTimeStamp(LocalDate timeStamp);

}
