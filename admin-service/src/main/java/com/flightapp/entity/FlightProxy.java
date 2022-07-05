package com.flightapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FlightProxy {
	
	
	private String userName;
	private String email;
	private Passenger passenger;
	private String optMeals;
	private int selectSeat;
}
