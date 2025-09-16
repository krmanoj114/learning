package com.test.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ITypeofItrationInJava {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(2,5,3,7,9,12);
		
		//Itretion type 1:Using for loop
		for(Integer list1: list) {
			System.out.println(list1+"");
		}
		//Itretion type 1:Using for loop
		for(int i = 0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		// iteration type 4  : using While loop
		int index = 0;
		while(index<list.size()) {
			System.out.println("While loop::"+list.get(index));
			index++;
		}
		
		// iteration type 5  : using  Iterable forEach loop 
		list.forEach(s-> {
			System.out.println("ForEach:::"+s);
		});
		
		  // iteration type 6  : using  Iterator
		
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println("Iterator:::"+itr.next());
//		}
		
		
		ListIterator<Integer> listI = list.listIterator();
		while(listI.hasPrevious()) {
			System.out.println("List Itretor::"+listI.previous());
		}
		
		
	}

}
