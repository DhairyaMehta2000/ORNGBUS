package com.ogbus.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ogbus.model.Booking;
import com.ogbus.repository.BookingRepo;

@RestController
@RequestMapping("booking/")
@CrossOrigin(origins = "http://localhost:4200")
public class Bookingcontroller {
	@Autowired
	private BookingRepo bookingRepo;

	// get all bookings
	@GetMapping("get")
	public List<Booking> getAllBooking() {
		return bookingRepo.findAll();
	}

	// create booking rest api
	@PostMapping("createbooking")
	public Booking createBooking(@RequestBody Booking booking) {
		return bookingRepo.save(booking);
	}

	// get Booking by id rest api
	@GetMapping("/get/{uid}")
	public ResponseEntity<List<Booking>> getBookingById(@PathVariable BigInteger uid) {
		List<Booking> booking = bookingRepo.findAllBookingByUid(uid);

		return ResponseEntity.ok(booking);
	}

	


	
	@DeleteMapping("drop/{id}")
	public void deletebooking(@PathVariable Long id){
		
			bookingRepo.deleteById(id);
	}

	@GetMapping("getbookings/{busNumber}/{date}")
	public List<Booking> getBookingsByUseEmail(@PathVariable String busNumber, @PathVariable String date) {
		System.out.println(bookingRepo.getbookingsbybus(busNumber, date));
		return bookingRepo.getbookingsbybus(busNumber, date);

	}
	


}
