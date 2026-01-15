package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepo;
@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;
	public List<Book> findAll(){
		return bookRepo.findAll();
	}
    public Book insert(Book book){
    	return bookRepo.save(book);
    }
    public List<Book> findByTitle(String Title){
    	return bookRepo.findByTitle(Title);
    } 
	public Book update(Book book) {
		Book current= bookRepo.findById(book.getBook_id()).get();
				current.setTitle(book.getTitle());
				current.setDescraption(book.getDescraption());
				current.setPublication_date(book.getPublication_date());
		return bookRepo.save(current);
	}
	public void delete(Long id) {
	    bookRepo.deleteById(id);
	}

}
