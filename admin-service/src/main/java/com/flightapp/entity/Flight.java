package com.flightapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "flight_table")
public class Flight {

	
	private String flightNo;
    private String carrierName;
    private String flightModel;
    private int seatCapacity;
    private Date date;
	private String AirlineName;
	private double price;
	private String FromPlace; 
	private String ToPlace;
}
