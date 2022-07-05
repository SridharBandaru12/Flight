package com.flightapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.entity.User;
import com.flightapp.response.TicketResponse;
import com.flightapp.service.UserService;

import lombok.AllArgsConstructor;

@RequestMapping("api/users")
@RestController
@AllArgsConstructor

public class UserServiceController{

	private final Environment environment;
	private final UserService flightService;

	/*public CouponServiceController(Environment environment,CouponService couponService) {
		
		this.environment = environment;
		this.couponService=couponService;
	}*/
	
	@RequestMapping 
	public ResponseEntity<?> getStatus()
	{
		return ResponseEntity.ok("flight-ws is woring and listing on port: "+environment.getProperty("local.server.port"));
	}
	/*@GetMapping("/tickets/{name}")
	public Ticket getTicketByName(@PathVariable("Name")String Name)
	{
		return flightService.getTicketByName(Name);
	}*/

	

	@PostMapping
	public ResponseEntity<TicketResponse> createTicket(@RequestBody User ticket) {
		User tempTicket = flightService.createTicket(ticket);
		TicketResponse response = new TicketResponse();
		response.setName(tempTicket.getName());
		response.setEmail(tempTicket.getEmail());
		response.setPassenger(tempTicket.getPassenger());
		response.setSeatNumber(tempTicket.getSeatNumber());
		response.setNumberOfSeatsToBook(tempTicket.getNumberOfSeatsToBook());
		response.setOptForMeal(tempTicket.getOptForMeal());

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping
	public ResponseEntity<?> getAllTickets() {
		List<User> tickets = flightService.getAllTickets();
		List<TicketResponse> ticketResponses = new ArrayList<>();
		for (User tempTicket : tickets) {
		TicketResponse response = new TicketResponse();
		response.setName(tempTicket.getName());
		response.setEmail(tempTicket.getEmail());
		response.setPassenger(tempTicket.getPassenger());
		response.setSeatNumber(tempTicket.getSeatNumber());
		response.setNumberOfSeatsToBook(tempTicket.getNumberOfSeatsToBook());
		response.setOptForMeal(tempTicket.getOptForMeal());

			ticketResponses.add(response);
		}
		return ResponseEntity.status(HttpStatus.OK).body(ticketResponses);
	}

	@GetMapping("/{Name}")
	public ResponseEntity<?> getTicketByName(@PathVariable("Name") String Name) {
		User ticket = null;
		try {
			ticket = flightService.getTicketByName(Name);

		} catch (NumberFormatException e) {
			throw new NumberFormatException("please provide valid Name");
		}
		if (ticket == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("coupon with couponId " + Name + " not found");
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(ticket);
		}

	}

	/*@DeleteMapping("/{couponId}")
	public ResponseEntity<?> deleteCouponByid(@PathVariable("couponId") int couponId) {
		couponService.deleteById(couponId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping("/{couponId}")
	public ResponseEntity<?> updateCoupon(@PathVariable("couponId") int couponId, @RequestBody Coupon coupon) {
		Coupon o = null;
		try {
			o = couponService.updateCouponById(couponId, coupon);

		} catch (NumberFormatException e) {
			throw new NumberFormatException("please provide valid coupon-id");
		}
		if (coupon == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("coupon with couponId " + couponId + " not found");
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(o);
		}
	}*/
	
}
