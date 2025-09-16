package com.test.lamda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
   // (o1, o2) ->  o1.getName().compareTo(o2.getName();
	
	
	
	public List<Book> getBooksInSort() {
		
		List<Book> books = new BookDAO().getBooks();
		
	//	Collections.sort(books, new MyComparator());
		Collections.sort(books, (o1, o2) ->  o1.getName().compareTo(o2.getName()));
//				new Comparator<Book>() {
//
//			@Override
//			public int compare(Book o1, Book o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		});
		
		return books;
	}
	
	class MyComparator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	
	public static void main(String args[]) {
		
		BookService bookService = new BookService();
		
		System.out.println("Books::"+bookService.getBooksInSort());
		
		
	}

}
