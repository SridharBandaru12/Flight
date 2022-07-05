package com.flightapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.entity.Flight;
import com.flightapp.exception.ValidateFlightException;
import com.flightapp.service.FlightService;

import lombok.AllArgsConstructor;

@RequestMapping
@AllArgsConstructor
@RestController
public class FlightController {
	
	private FlightService flightService;
	
	@PostMapping(value = "/addFlight")
	public ResponseEntity<String> addFlight( @RequestBody() Flight flight, BindingResult br)
			throws ValidateFlightException {
		if (br.hasErrors()) {
			throw new ValidateFlightException(br.getFieldErrors());
		}
		String msg = "adding the flight :";
		flightService.addFlight(flight);
		return new ResponseEntity<String>("Flight added successfully!!", HttpStatus.OK);
	}

	

	// get all available flights
	@GetMapping(value = "/getFlights", produces = "application/json")
	public List<Flight> getFlights() {
		String msg = "View all flights :";
		
		return flightService.getFlights();
	}

	
	/*// Searching the flight by id
		@GetMapping(value = "/getFlight/{flightNo}", produces = "application/json")
		public ResponseEntity<Optional<Flight>> getFlight(@PathVariable String flightNo) throws FlightNotFoundException {
			String msg = "View the flight:";
			logger.info(msg);
			Optional<Flight> flight = flightService.getFlight(flightNo);
			if (flight.isPresent())
				return new ResponseEntity<Optional<Flight>>(flight, HttpStatus.OK);
			return new ResponseEntity<Optional<Flight>>(flight, HttpStatus.NOT_FOUND);
		}
	// Modifying the flight details
	@PutMapping(value = "/updateFlight", consumes = "application/json")
	public String updateFlight(@RequestBody() Flight flight) throws FlightNotFoundException {
		String msg = "update the flight :";
		logger.info(msg);
		flightService.updateFlight(flight);
		return "updated succesfully";
	}

	// Delete the flight by id
	@DeleteMapping("/deleteFlight/{flightNo}")
	public ResponseEntity<String> deleteFlight(@PathVariable String flightNo) throws FlightNotFoundException {
		String msg = "deleting  the flight :";
		logger.info(msg);

		flightService.deleteFlight(flightNo);
		return new ResponseEntity<String>("Flight Deleted Successfully!!", HttpStatus.OK);
	}

}*/


}
