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
import com.example.demo.entity.Author;
import com.example.demo.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private AuthService authservice;
	@GetMapping
	public List<Author> findAll(){
		return authservice.findAll();
	}
	@PostMapping
	public Author insert(@RequestBody Author Auth) {
		return authservice.insert(Auth);
	}
	@PutMapping
	public Author update(@RequestBody Author Auth) {
		return authservice.update(Auth);
	}
	@DeleteMapping("/delete/{id}") 
	public void delete(@PathVariable Long id) {
		authservice.delete(id);
	}
	

}
