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

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	@GetMapping
	public List<Book> findAll(){
		return bookService.findAll();
	}
	@PostMapping
	public Book insert(@RequestBody Book book) {
		return bookService.insert(book);
	}
	@GetMapping("/{Title}")
	public  List<Book> findByTitle(@PathVariable String Title){
		return bookService.findByTitle(Title);
	}
	@PutMapping
	public Book update(@RequestBody Book book) {
		return bookService.update(book);
	}
	@DeleteMapping("/delete/{id}") 
	public void delete(@PathVariable Long id) {
	    bookService.delete(id);
	}
}


