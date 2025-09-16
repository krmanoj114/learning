package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SynchronizationExample {
	
	int count = 0;
	
	void increament() {
		count=count+1;
	}
	
	ExecutorService executorService =  Executors.newFixedThreadPool(2);
	
	//IntStreamrange(0, 10000).forEach(i -> executor.submit(this::increment));
	//Stream<Integer> stream = IntStream.range(0, 1000).forEach(i -> executorService.submit(this::increament));  
	
	public static void main(String args[]) {
		
	}

}
