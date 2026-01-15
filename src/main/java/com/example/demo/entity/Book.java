package com.example.demo.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
@Table(name="Book")
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long book_id;
	@NotNull(message="should be enter title")
	private String title;
	private Date publication_date;
	private String descraption;
	@NotNull
	@JsonBackReference
    @ManyToOne
    @JoinColumn(name="auth_id")
    private Author author;
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublication_date() {
		return publication_date;
	}
	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}
	public String getDescraption() {
		return descraption;
	}
	public void setDescraption(String descraption) {
		this.descraption = descraption;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
    
}
