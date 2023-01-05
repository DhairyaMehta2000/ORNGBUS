package com.ogbus.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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
import com.ogbus.model.Bus;
import com.ogbus.model.Station;
import com.ogbus.repository.BusRepo;

@RestController
@RequestMapping("buses/")
@CrossOrigin(origins="http://localhost:4200")
public class Buscontroller {
    @Autowired
    private BusRepo busRepo;

    // get all buss
    @GetMapping("get")
    public List<Bus> getAllBus() {
        return busRepo.findAll();
    }

    // create bus rest api
    @PostMapping("createbus")
    public Bus createUser(@RequestBody Bus bus) {
        return busRepo.save(bus);
    }

    // get Bus by id rest api
    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<Bus>> getBusById(@PathVariable Long id) {
        Optional<Bus> bus = busRepo.findById(id);
        return ResponseEntity.ok(bus);
    }

    @GetMapping("/getbus/{id}")
    public Optional<Bus> getBus(@PathVariable Long id) {
    	return busRepo.findById(id);
    }
        
    @PostMapping("/createABus")
    public Bus createBus(@RequestBody Bus bus){
    	return  busRepo.save(bus);
    }
    
    @GetMapping("/getbus/{bus_from}/{bus_to}")
    public List<Bus> getbuses(@PathVariable String bus_from,@PathVariable String bus_to){

        System.out.println(busRepo.findbuses(bus_from,bus_to));

        return busRepo.findbuses(bus_from,bus_to);
    }
    

}
