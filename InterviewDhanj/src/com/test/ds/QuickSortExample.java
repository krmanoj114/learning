package com.test.ds;

import java.util.Arrays;

public class QuickSortExample {
	
	public static int partition(int array[], int low, int high) {
		
		int pivot = array[high];
		
		int i = (low - 1);
		
		for(int j=low; j<high; j++) {
			if(array[j]<= pivot) {
				i++;
				swap(array, i, j);
//				int temp = array[i];
//				array[i] = array[j];
//				array[j] = temp;
			}
		}
		swap(array, i+1, high);
//		int temp = array[i+1];
//		array[i+1] = array[high];
//		array[high] = temp;
		return (i+1);
		
	}
	
	public static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void quickSort(int array[], int low, int high ) {
		if(low<high) {
			
			int pi = partition(array, low, high);
			
			//left side
			quickSort(array, low, pi-1);
			
			//right side
			quickSort(array, pi+1, high);
			
		}
		
		
		
		
	}
	
	
	public static void main(String args[]) {
		
		
		QuickSortExample qs = new QuickSortExample();
		 int[] data = { 8, 7, 2, 1, 0, 9, 6 };
		 System.out.println("Unsorted Array");
		    System.out.println(Arrays.toString(data));
		
		
		 
		 int size = data.length;
		 
		 QuickSortExample.quickSort(data, 0, size-1);
		 System.out.println("Sorted Array in Ascending Order ");
		    System.out.println(Arrays.toString(data));
		
	}

}
