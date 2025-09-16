package com.test.mixed;

import java.util.Scanner;

public class FibonacciCalculator {
	
	
	public static int fibonacci2(int number){
		if(number == 1 || number == 2){
			return 1;
		}else{
			return fibonacci2(number-1)+fibonacci2(number-2);
		}
	}
	
	
	public static int fibonacci(int number){
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		if(number == 1 || number == 2){
			return 1;
		}
		else{
			for(int i=3; i<= number; i++){
				
				fibonacci = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibonacci;
				
			}
			
			return fibonacci;
		}
	}
	
	public static void main(String args[]){
		
		System.out.println("Enter number upto which Fibonacci series to print: ");
		
		int number = new Scanner(System.in).nextInt(); 
		System.out.println("Fibonacci series upto " + number +" numbers : ");
	     for(int i=1; i<=number; i++){ 
	    	 System.out.print(fibonacci(i) +" "); 
	    	 }		
	}

}
