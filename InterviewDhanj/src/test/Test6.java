package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {	
	
	public static void main(String[] args) {
		
//		List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8);
//		
//		List <Integer> list1 = list.stream().filter(num -> (num%2 != 0) && num>3).collect(Collectors.toList());
//		
//		System.out.println(list1);
		
		int[] numbers = {5,2,8,3,1,1};
		
	//	List<Integer> number = Arrays.stream(numbers).sorted().boxed().skip(1).collect(Collectors.toList());
		int number = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Array does not have second highest element"));
		System.out.println(number);
	}	
	

}
