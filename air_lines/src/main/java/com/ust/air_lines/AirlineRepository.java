package com.ust.air_lines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.air_lines.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long>{

}
