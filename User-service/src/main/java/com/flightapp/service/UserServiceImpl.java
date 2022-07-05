package com.flightapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightapp.dao.UserRepository;
import com.flightapp.entity.User;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor


public class UserServiceImpl implements UserService {
private final UserRepository userRepository;

@Override
public User createTicket(User ticket) {
	// TODO Auto-generated method stub
	return userRepository.save(ticket);
}

@Override
public List<User> getAllTickets() {
	// TODO Auto-generated method stub
	return (List<User>) userRepository.findAll();
}

@Override
public User getTicketByName(String Name) {
	// TODO Auto-generated method stub
	return userRepository.getTicketByName(Name);
}

public User cancelTicket(User ticket) {
	// TODO Auto-generated method stub
	return userRepository.createTicket(ticket);
}

	

	
}
