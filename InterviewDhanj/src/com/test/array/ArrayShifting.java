package com.test.array;

public class ArrayShifting {
	
	static void arrayPositionShifting(int array[]) {
		
		int lastElement = array[array.length-1];
		
		for(int i=array.length-1; i >0;i--) {
			array[i]=array[i-1];
			System.out.println("Array Position::"+array[i]);
		}
		
		array[0]= lastElement;
		
	}
	
	public static void main(String args[]) {
		
		int a[]= {2,3,4,1};
		
		arrayPositionShifting(a);
		
		for(int num: a) {
			System.out.println(num);
		}
	}

}
