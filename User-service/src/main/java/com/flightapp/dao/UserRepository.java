package com.flightapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User createTicket(User ticket);
	List<User> getAllTickets();
	User getTicketByName(String Name);
	User cancelTicket(String Name);
}
