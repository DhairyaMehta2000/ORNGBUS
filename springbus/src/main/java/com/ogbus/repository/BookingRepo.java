package com.ogbus.repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

//import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ogbus.model.Booking;

@Repository

public interface BookingRepo extends JpaRepository<Booking, BigInteger> {
	@Query("select b from Booking b where emailId = ?1")
	List<Booking> getbookingsbyemail(String email);

	@Query("select b from Booking b where busNumber = ?1 and bookedDate = ?2")
	List<Booking> getbookingsbybus(String busNumber, String bookedDate);

	Optional<Booking> findById(BigInteger uid);
	@Transactional
	void deleteById(Long id);
	List<Booking> findAllBookingByUid(BigInteger uid);;

}
