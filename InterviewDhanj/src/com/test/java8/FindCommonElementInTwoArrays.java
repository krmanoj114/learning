package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementInTwoArrays {
	
	public static void featchCommonArray(int array1[], int array2[]) {
		
		List<Integer> commonElement = Arrays.stream(array1).filter(number -> Arrays.stream(array2).anyMatch(array2Number -> array2Number==number)).boxed().collect(Collectors.toList());
		System.out.println("commonElement:::"+commonElement);
	}
	
	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5,7};
		int [] array2 = {4,5,6,7};
		featchCommonArray(array1, array2);
		
	}

}
