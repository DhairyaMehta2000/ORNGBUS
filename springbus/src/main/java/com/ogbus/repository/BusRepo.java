package com.ogbus.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.ogbus.model.Bus;

@Repository

public interface BusRepo extends JpaRepository<Bus, Long> {
	@Query("select t from Bus t where busFrom= ?1 and busTo = ?2")
	List<Bus> findbuses(String busFrom, String busTo);
}