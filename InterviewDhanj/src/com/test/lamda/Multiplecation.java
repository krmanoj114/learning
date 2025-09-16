package com.test.lamda;


interface MultiplyOp {
	
	int multiply(int a, int b, int c);
	
}

public class Multiplecation {
	
	
	public static void main(String args[]) {
//		int a=10;
//		int b=20;
//		int c=30;
		
		MultiplyOp mul = ( a,  b,  c) ->  a*b*c;		
		
		
		System.out.println(mul.multiply(10, 20, 30));
	}

}
