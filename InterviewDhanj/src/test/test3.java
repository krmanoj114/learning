package test;

import java.util.ArrayList;
import java.util.Arrays;

public class test3 {
	
	public static void shiftLastToFirst(int[] arr) {
     //   if (arr.length >= 2) {  // Check if the array has at least two elements
            int lastElement = arr[arr.length - 1];  // Get the last element
            
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];  // Shift elements to the right
               // System.out.println(arr[i]);
            }
            
            arr[0] = lastElement;  // Assign the last element to the first position
            
        }
  //  }
	
	public static void main(String args[]) {
		
		//List<Integer> list = Arrays.asList(1,7,9,5,11);
		
		int array [] = {1,7,9,5,11};
		
		shiftLastToFirst(array);
		
		for(int num: array) {
			System.out.println(num);
		}
		
	}

}



 