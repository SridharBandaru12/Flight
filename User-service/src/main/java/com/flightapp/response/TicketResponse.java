package com.flightapp.response;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.flightapp.entity.Passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@Table(name="flight_table")
  public class TicketResponse {
	private String Name;
	private String Email;
	private int NumberOfSeatsToBook;
	private Passenger passenger;
	private String OptForMeal;
	private int seatNumber;

}