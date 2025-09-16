package com.test.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

//	@Override
//	public void accept(Integer t) {
//		System.out.println("Pricing::"+t);
//		
//	}
//	
	public static void main(String[] args) {
		
//		Consumer<Integer> consumer = (t) -> {
//			System.out.println("Pricing::"+t);
//			
//		};
		
	//	Consumer<Integer> consumer = t -> System.out.println("Pricing::"+t);
		
	//	consumer.accept(10);
		
		List<Integer> list = Arrays.asList(10,20,30,50);
		
	//	list.stream().forEach(consumer);
		list.stream().forEach(t -> System.out.println("Pricing::"+t));
		
		
	}

}
