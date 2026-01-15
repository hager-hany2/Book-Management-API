package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Author;
@Repository
public interface AuthRepo extends JpaRepository<Author,Long>{
	List<Author> findAll();

	
}
