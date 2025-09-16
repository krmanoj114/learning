package com.test.mixed;

public class PrimeNumber {
	
	public boolean primeNumber(int n) {
		if(n==0 || n== 1) {
			return false;
		}
		if(n%2==0) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public static void main(String args[]) {
		int number =8;
		PrimeNumber pn = new PrimeNumber();
		boolean prime = pn.primeNumber(number);
		if(prime) {
			System.out.println("Number "+number+" is prime number");
		}
		else 
			System.out.println("Number "+number+" is not prime number");
	}

}
