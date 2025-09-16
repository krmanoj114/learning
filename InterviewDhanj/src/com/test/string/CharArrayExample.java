package com.test.string;

public class CharArrayExample {
	
	public static void main(String args[]){
		
		String str = new String("123456789");
		char[] array = str.toCharArray();
		int len = array.length;
		
		String reverse = "";
		for(int j=0; j<len-1; j++){
			System.out.println(array[j]);
		}
		
//		for(int i=array.length-1; i>=0; i--){
//			System.out.println(array[i]);
//		}
//		for(char c: array){
//		System.out.println(c);
//		}
		
		for(int i=str.length()-1; i>=0; i--){
			
			reverse = reverse + str.charAt(i);
			
			
		}
		System.out.println("reverse:::::::"+reverse);
	}

}
