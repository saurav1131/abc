package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;



@RestController
@RequestMapping("/api/v1")
	public class UserController {
		@Autowired
		private UserRepository Userrepository;
		
		@GetMapping("/users")
	public List<User>getAllUsers(){
		return Userrepository.findAll();
		
	}
		@PostMapping("/user")
		public User createUser(@RequestBody User user) {
			return Userrepository.save(user);
			
		}
		@PutMapping("/userupdate")
		public User updateUser(@RequestBody User user) {
			return Userrepository.save(user);
			
		}
		@DeleteMapping(value = "delete/{id}")  
		 public void removepro(@PathVariable int id)
		 {
			 Userrepository.deleteById(id);
		 }
		

}
