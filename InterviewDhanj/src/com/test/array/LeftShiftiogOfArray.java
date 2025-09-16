package com.test.array;

public class LeftShiftiogOfArray {
	
	static void leftShifting(int array[]) {
		
		int firstElement = array[0];
		
		
		for(int i=0; i<array.length-1; i++) {
			
			array[i]=array[i+1];
			
			System.out.println("Array Position::"+array[i]);
			
		}
		
		array[array.length-1] = firstElement;
		
		
	}
	
	public static void main(String args[]) {
		
		int a[] = {1,2,3,4,5};  //output:::{2,3,4,5,1}
		
		//left shifting of array
		leftShifting(a);
		
		for(int num: a) {
			System.out.println(num);
		}
	}

}
