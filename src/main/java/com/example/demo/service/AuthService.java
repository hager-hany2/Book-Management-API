package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Author;
import com.example.demo.repository.AuthRepo;


@Service
public class AuthService {
	@Autowired
	private AuthRepo authRepo;
	public List<Author> findAll(){
		return authRepo.findAll();
	}
	public Author insert(Author author) {
		return authRepo.save(author);
	}
	public Author update(Author Auth) {
		Author current= authRepo.findById(Auth.getAuthor_Id()).get();
		        current.setName(Auth.getName());
				current.setBio(Auth.getBio());
				current.setNationality(Auth.getNationality());
		return authRepo.save(current);
	}
	public void delete(Long id) {
	    authRepo.deleteById(id);
	}
	

}
