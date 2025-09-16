package com.test.mixed;

import java.util.Scanner;

public class FactorialInJava {
	
	public static int factorial(int number){
		if(number == 0){
			return 1;
		}
			return number*factorial(number-1);
		
	}
	
	
	public static int factorial1(int number){
		int result = 1;
		
		while(number != 0){
            result = result*number;
            number--;
        }
      
        return result;


	}
	
	public static void main(String args[]){
		System.out.println("factorial of 5 using recursion in Java is: " + factorial1(5)); 

		}

}
