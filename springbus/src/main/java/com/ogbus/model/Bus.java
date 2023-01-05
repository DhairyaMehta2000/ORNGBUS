package com.ogbus.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long busId;
	@Column(name = "bus_name")
	private String busName;
	@Column(name = "bus_number")
	private String busNumber;
	@Column(name = "bus_start_time")
	private Time busStartTime;
	@Column(name = "bus_end_time")
	private Time busEndTime;
	@Column(name = "bus_fair")
	private String busFair;
	@Column(name = "bus_from")
	private String busFrom;
	@Column(name = "bus_to")
	private String busTo;
	@Column(name = "travel_time")
	private Time travelTime;

	public Bus() {

	}

	

	public Bus(long busId, String busName, String busNumber, Time busStartTime, Time busEndTime, String busFair,
			String busFrom, String busTo, Time travelTime) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busNumber = busNumber;
		this.busStartTime = busStartTime;
		this.busEndTime = busEndTime;
		this.busFair = busFair;
		this.busFrom = busFrom;
		this.busTo = busTo;
		this.travelTime = travelTime;
	}



	public long getbusId() {
		return busId;
	}

	public void setbusId(long busId) {
		this.busId = busId;
	}

	public String getbusName() {
		return busName;
	}

	public void setbusName(String busName) {
		this.busName = busName;
	}

	public String getbusNumber() {
		return busNumber;
	}

	public void setbusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public Time getbusStartTime() {
		return busStartTime;
	}

	public void setbusStartTime(Time busStartTime) {
		this.busStartTime = busStartTime;
	}

	public Time getbusEndTime() {
		return busEndTime;
	}

	public void setbusEndTime(Time busEndTime) {
		this.busEndTime = busEndTime;
	}

	public String getbusFair() {
		return busFair;
	}

	public void setbusFair(String busFair) {
		this.busFair = busFair;
	}

	public String getbusFrom() {
		return busFrom;
	}

	public void setbusFrom(String busFrom) {
		this.busFrom = busFrom;
	}

	public String getbusTo() {
		return busTo;
	}

	public void setbusTo(String busTo) {
		this.busTo = busTo;
	}

	public Time getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(Time travelTime) {
		this.travelTime = travelTime;
	}

}
