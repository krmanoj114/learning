package com.test.lamda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBooks() {
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book(101, "Core JAva", 400));
		books.add(new Book(102, "Spring", 200));
		books.add(new Book(103, "Hibernate", 300));
		books.add(new Book(104, "JPA", 500));
		books.add(new Book(105, "Radis", 100));
		
		return books;
	}

}
