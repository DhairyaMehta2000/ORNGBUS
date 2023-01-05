package com.ogbus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
@Entity
@Table
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "booked_from", nullable = false)
	private String bookedFrom;
//	@Column(name = "email_id", nullable = true)
//	private String emailId;
	@Column(name = "booked_to", nullable = false)
	private String bookedTo;
	@Column(name = "bus_time", nullable = false)
	private String busTime;
	@Column(name = "booked_date")
	private String bookedDate;
	@Column(name = "bus_number")
	private String busNumber;
	@Column(name = "bus_name")
	private String busName;
	@Column(name = "paid_fare")
	private String paidFair;
	@Column(name = "seat_number")
	private int seatNumber;
	@Column(name = "ticket_id")
	private String ticketId;
	@Column(name = "ticket_status")
	private String ticketStatus;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_gender")
	private String customerGender;
	@Column(name = "customer_age")
	private String customerAge;	
	@Column(name="uid")
	private BigInteger uid;

	public BigInteger getUid() {
		return uid;
	}



	public void setUid(BigInteger uid) {
		this.uid = uid;
	}



	public Booking() {

	}
	
	

	public Booking(Long id, String bookedFrom, String bookedTo, String busTime, String bookedDate,
			String busNumber, String busName, String paidFair, int seatNumber, String ticketId, String ticketStatus,
			String customerName, String customerGender, String customerAge,BigInteger uid) {
		super();
		this.id = id;
		this.bookedFrom = bookedFrom;
//		this.emailId = emailId;
		this.bookedTo = bookedTo;
		this.busTime = busTime;
		this.bookedDate = bookedDate;
		this.busNumber = busNumber;
		this.busName = busName;
		this.paidFair = paidFair;
		this.seatNumber = seatNumber;
		this.ticketId = ticketId;
		this.ticketStatus = ticketStatus;
		this.customerName = customerName;
		this.customerGender = customerGender;
		this.customerAge = customerAge;
		this.uid=uid;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookedFrom() {
		return bookedFrom;
	}

	public void setBookedFrom(String bookedFrom) {
		this.bookedFrom = bookedFrom;
	}
//
//	public String getEmailId() {
//		return emailId;
//	}
//
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}

	public String getBookedTo() {
		return bookedTo;
	}

	public void setBookedTo(String bookedTo) {
		this.bookedTo = bookedTo;
	}

	public String getBusTime() {
		return busTime;
	}

	public void setBusTime(String busTime) {
		this.busTime = busTime;
	}

	public String getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(String bookedDate) {
		this.bookedDate = bookedDate;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getPaidFair() {
		return paidFair;
	}

	public void setPaidFair(String paidFair) {
		this.paidFair = paidFair;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(String customerAge) {
		this.customerAge = customerAge;
	}
	
	
}



