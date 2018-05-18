package com.marmil.test.hibernate1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	private int id;
	@Column(name="book_title")
	private String Title;
	@Column(name="book_author")
	private Author Author;
	@ManyToMany(mappedBy="books")
	private List<Reader> readers = new ArrayList<Reader>();
	@Transient
	private int pageNumbers;
	
	
	public List<Reader> getReaders() {
		return readers;
	}
	public void setReaders(List<Reader> readers) {
		this.readers = readers;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}

	public Author getAuthor() {
		return Author;
	}
	public void setAuthor(Author author) {
		Author = author;
	}
	public int getPageNumbers() {
		return pageNumbers;
	}
	public void setPageNumbers(int pageNumbers) {
		this.pageNumbers = pageNumbers;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public int getId() {
		return id;
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", Title=" + Title + ", Author=" + Author + ", pageNumbers=" + pageNumbers + "]";
	}
	
	
}
