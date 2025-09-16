package com.test.string;
import java.util.HashSet;
import java.util.Set;


public class duplicateElement {	
	
	public static void main(String args[]){
		Set set = new HashSet<>();
		int count =0;
		
		String names[] = {"Dhananjay", "Ashutosh", "Devyansh", "Dhananjay", "Devyansh", "Dhananjay", "Dhananjay"};
		
		for (int i = 0; i < names.length; i++) { 
			for (int j = i + 1 ; j < names.length; j++) { 
				if (names[i].equals(names[j])) {
					
					System.out.println("ELement:::"+names[i]);
					count ++;
				}
			}
		}
		
		System.out.println(count);
		
		
		for (String name : names) { 
			if (set.add(name) == false) { 
				
				System.out.println(name);
				
			}
		}

		

			
		
	}

}
