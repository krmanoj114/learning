package com.test.lamda;

import java.util.function.Predicate;

public class PredicateDemo{
	
	
	
	public static void main(String[] args) {
		
//		Predicate<Integer> predicate = new PredicateDemo();
//		System.out.println(predicate.test(10));
		
//		Predicate<Integer> predicate = (t)  -> {
//			if(t%2==0) {
//				return true;
//			}
//			else {
//			return false;
//			}
//		};
		
		Predicate<Integer> predicate = t -> t%2==0;
		System.out.println(predicate.test(11));
	}

//	@Override
//	public boolean test(Integer t) {
//		if(t%2==0) {
//			return true;
//		}
//		else {
//		return false;
//		}
//	}
	
	
	
	


}
