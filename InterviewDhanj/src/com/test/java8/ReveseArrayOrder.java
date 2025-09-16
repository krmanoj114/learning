package com.test.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReveseArrayOrder {
	
	public static void reverseArray(int array[]) {
		
		IntStream.range(0, array.length/2).forEach(i-> {
			int temp = array[i];
			array[i] = array[array.length - i- 1];
			array[array.length - i- 1] =temp;
					
		});
		
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7};
		
		reverseArray(array);
		
		
		
	}

}
