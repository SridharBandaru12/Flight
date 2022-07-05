package com.flightapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightapp.entity.Flight;
import com.flightapp.repository.FlightRepository;

import lombok.AllArgsConstructor;



@AllArgsConstructor
@Service
public class FlightServiceImpl implements FlightService
{

	private final FlightRepository flightRepository;
	
	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.save(flight);
	}

	
	@Override
	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		 return (List<Flight>) flightRepository.findAll();
	}
	
	/*@Override
	public Flight updateFlight(Flight flight) {
		if(flight.existsById(flight.getFlightNo()))
		   {
			   flight.save(flight);
		   return "flights were updated successfully";
	       }
		   else
		   {
			   throw new FlightNotFoundException();
		   }
		
	}

	@Override
	public Flight deleteFlight(String flightNo) {
		if(!flight.existsById(flightNo))
		   {
			   throw new FlightNotFoundException();
		   }
		   else
		   {
			   flightRepository.deleteById(flightNo);
		   }
	   }
		
	}

	

	@Override
	public Optional<Flight> getFlight(String flightNo) {
		if(!flight.existsById(flightNo))
		   {
			   throw new FlightNotFoundException();
		   }
		   else {
		   return flightRepository.findById(flightNo);
	   }
	}*/
	

}
