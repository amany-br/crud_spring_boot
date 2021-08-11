package com.project.rdv.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.rdv.dao.userRepository;
import com.project.rdv.entities.user;

@Service
public class userService {
	
	@Autowired
	userRepository userRepository;
	
	public List<user> readAll(){
		return userRepository.findAll();
	}
	
	public user create(user u ){
		return userRepository.save(u);
	}
	public  user update(user u ){
		return userRepository.save(u);
	}
	public void delete(Integer id){
		userRepository.deleteById(id);
	}
	public user readById(Integer id){
		return userRepository.findById(id).get();
	}

}
