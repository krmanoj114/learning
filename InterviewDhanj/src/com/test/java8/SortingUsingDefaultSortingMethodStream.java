package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingDefaultSortingMethodStream {

	public static void main(String[] args) {
		
		int array[] = {2,5,-4,-2,5};
		
		Integer min = Arrays.stream(array).boxed().min((n1,n2)->n1.compareTo(n2)).get();
		System.out.println(min);
		
		Integer min1 = Arrays.stream(array).boxed().min(Integer::compare).get();
		System.err.println(min1);
		
		
		List<Integer> list = Arrays.asList(2,4,5,9,1,3);
		
		list = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted List:::"+list);
		
		int max = list.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		
		System.out.println("Max Element:::"+max);
		
		//Sorted list in descending order
		
		list = list.stream().sorted((s2, s1)-> s1.compareTo(s2)).collect(Collectors.toList());
		
		//list = list.stream().sorted((s1, s2)-> s1.compareTo(s2)).collect(Collectors.toList());
		
		System.out.println("Descending order sorting:::"+list);
		
		list = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Revers Order sorting with Collection reversorder Method:::"+list);
		

	}

}
