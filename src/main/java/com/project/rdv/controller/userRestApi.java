package com.project.rdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


import com.project.rdv.entities.user;
import com.project.rdv.service.*;

@RestController
public class userRestApi {
	
	@Autowired
	userService userService;
	
	@PostMapping(path="/new-user")
	public user post(@RequestBody user u) {
		return userService.create(u);
		}
	@PutMapping(path="/edit-user")
	public user put(@RequestBody user u) {
		return userService.update(u);
		}
	

	@GetMapping(path="/users")
	public List<user> get() {
		return userService.readAll();
		
	}
	@GetMapping(path="/user/{id}")
	public user get(@PathVariable Integer id ) 
	{
		return userService.readById(id);
		}
	@DeleteMapping(path="/remove-user/{id}")
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
		
	}

}



	
	
	
		
	
	
	
	
	
	
