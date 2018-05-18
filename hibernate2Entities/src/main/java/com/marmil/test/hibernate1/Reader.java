package com.marmil.test.hibernate1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Reader {

	@Id
	private int Id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@ManyToMany
	private List<Book> books = new ArrayList<Book>();

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Reader [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", books=" + books + "]";
	}
	
}
