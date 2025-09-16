package com.test.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ProcessorTest implements Runnable {
	
	private CountDownLatch latch;
	
	public ProcessorTest(CountDownLatch latch) {
		
		this.latch = latch;
	}
	
	public void run() {
		
		
			
			System.out.println("Started...");
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		latch.countDown();
		
	}
	
	
}

public class CountDownLatchExample {
	
	
	public static void main(String [] args) {
		
		CountDownLatch latch = new CountDownLatch(1);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(int i=0; i<5; i++){
		service.submit(new ProcessorTest(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Task Completed...");
		
	}

}
