package com.flightapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
	 Flight addFlight(Flight flight);
	// Flight  updateFlight(Flight flight);
	// Flight deleteFlight(String flightNo);
	   List<Flight> getFlights();
	 //  Optional<Flight> getFlight(String flightNo);
	//Flight deleteById(String flightNo);

}
