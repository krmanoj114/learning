package com.test.java8;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverseOrderExample {
	
	
	public static void main(String args[]) {
		
		System.out.println(reverse("My Name is Dhananjay"));
	}
	
	public static String reverse(String str) {
		
		return Stream.of(str).map(word-> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
	}
	
//	public static Stream<String> reverse(String str) {
//		
//		Stream<String> stream = Stream.of(str);
//		
//		 stream.sorted(Comparator.comparingInt(String::length).reversed());
//		 stream.forEach(System.out::println);
//		
//		return  stream;
//	}

}
