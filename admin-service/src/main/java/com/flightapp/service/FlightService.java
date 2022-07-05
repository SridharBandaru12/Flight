package com.flightapp.service;

import java.util.List;
import java.util.Optional;

import com.flightapp.entity.Flight;

public interface FlightService {
	  public Flight addFlight(Flight flight);
	 // public Flight updateFlight(Flight flight);
	 // public Flight deleteFlight(String flightNo);
	  public List<Flight> getFlights();
	  //public Optional<Flight> getFlight(String flightNo);
}