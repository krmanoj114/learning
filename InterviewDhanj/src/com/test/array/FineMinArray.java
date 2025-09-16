package com.test.array;

public class FineMinArray {
	
	static void min(int array[]) {
		
		int min = array[0];
		
		for(int i=1;i<array.length;i++) {
			
			if(min>array[i]) {
				min=array[i];
				
			}
		}
		System.out.println("Min::"+min);
	}
	
	static void max(int array[]) {
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max =array[i];
			}
		}
		System.out.println("Max::"+max);
	}
	
	public static void main(String args[]) {
		
		
		int a[] = {10,29,3,48,1};
		
		min(a);
		max(a);
	}

}
