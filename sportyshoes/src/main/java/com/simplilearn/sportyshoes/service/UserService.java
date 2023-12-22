package com.simplilearn.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.simplilearn.sportyshoes.model.User;
import com.simplilearn.sportyshoes.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public List<User> getAllUser(){return  userRepository.findAll();}

	public void removeUserById(int id) {userRepository.deleteById(id);}


	
	
	
}