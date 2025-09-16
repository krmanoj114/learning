package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,6,5,7,9);
		
		List<String> words = Arrays.asList("dhananjay", "kamal","punit");
		
		int sum = 0;
		for(int i: list) {
			sum = sum+i;
		}
		System.out.println("Sum::"+sum);
		
		
		int sum2 = list.stream().mapToInt(i->i).sum();
		System.out.println("SUM2::"+sum2);
		
		int sum1= list.stream().reduce(0, (a,b)-> a+b);
		System.out.println("SUM1:::"+sum1);
		
		Optional<Integer> sumWithMethodReference = list.stream().reduce(Integer::sum);
		System.out.println(sumWithMethodReference.get());
		
		
		Integer multiplication = list.stream().reduce(1, (a,b)-> a*b);
		System.out.println("Multiplication::::"+multiplication);
		
		Integer max = list.stream().reduce(0, (a,b)-> a>b ? a:b);
		
		System.out.println("Max::"+max);
		
		Integer maxWithMethodReference =  list.stream().reduce(Integer::max).get();
		System.out.println("maxWithMethodReference:::"+maxWithMethodReference);
		
		String longestString = words.stream().reduce((a,b)-> a.length() > b.length() ? a : b).get();
		System.out.println("longestString::"+longestString);
		
		
		
		
	}

}
