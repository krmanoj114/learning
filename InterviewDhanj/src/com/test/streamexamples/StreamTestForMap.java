package com.test.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTestForMap {
	
	
	public static void main(String args[]) {
		
		// create a list of integers 
	    List<Integer> number = Arrays.asList(2,3,4,5); 
	  
	    // demonstration of map method 
	    List<Integer> square = number.stream().map(x -> x*x). 
	                           collect(Collectors.toList()); 
	    System.out.println(square); 
	    
	    
	    List<String> names = Arrays.asList("Reflection","Collection","Stream", "dhananjay", "devyansh");
	    List<String> result = names.stream().filter(s->s.startsWith("d")).collect(Collectors.toList());
	    
	    System.out.println("Result:::"+result);
	    
	    String resultFindAny = names.stream().filter(s->s.startsWith("d")).findAny().orElse(null);
	    
	    System.out.println("resultFindAny:::"+resultFindAny);
	    
        List<Integer> myList = Arrays.asList(8,34,12,78,18,89,11,5,10,117,5);
		
		myList.stream().map(s-> s +"").filter(s-> s.startsWith("1")).forEach(System.out::println);
		
	
		
	    
	    
	   
	}

}
