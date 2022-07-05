package com.flightapp.service;

import java.util.List;

import com.flightapp.entity.User;


public interface UserService {
	User createTicket(User ticket);
	List<User> getAllTickets();
	User getTicketByName(String Name);
	User cancelTicket( User ticket );

 
}
