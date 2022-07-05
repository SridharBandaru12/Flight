package com.flightapp.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
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
@Table(name="user_table")
public class User {
	private String Name;
	private String Email;
	private int NumberOfSeatsToBook;
	private Passenger passenger;
	private String OptForMeal;
	private int seatNumber;
	private Date date;
	private String AirlineName;
	private double price;
	private String FromPlace; 
	private String ToPlace;
}
