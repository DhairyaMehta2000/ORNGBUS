package com.ogbus.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ogbus.model.Station;
import com.ogbus.repository.StationRepo;

@RestController
@RequestMapping("stations/")
@CrossOrigin(origins="http://localhost:4200")
public class Stationcontroller {
	@Autowired
	private StationRepo stationRepo;

	// get all stations
	@GetMapping("get")
	public List<Station> getAllStations() {
		return stationRepo.findAll();
	}

	// create station rest api
	@PostMapping("createstation")
	public Station createStation(@RequestBody Station station) {
		return stationRepo.save(station);
	}

	// get Station by id rest api
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Station>> getStationById(@PathVariable Long id) {
		Optional<Station> station = stationRepo.findById(id);
		return ResponseEntity.ok(station);
	}

	
	
	
	

	
	
}
