package com.ogbus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ogbus.model.Station;


@Repository
public interface StationRepo extends JpaRepository<Station, Long> {

}
