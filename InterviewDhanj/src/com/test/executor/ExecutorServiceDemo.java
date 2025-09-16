package com.test.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;



//class Task implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//		
//	}
//	
//	
//}

class Task implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
public class ExecutorServiceDemo {
	
	
	
	public static void main(String[] args) {
		
//		Executor executor = Executors.newFixedThreadPool(3);
//		Runnable r =() -> {
//			System.out.println(Thread.currentThread().getName());
//		};
//		
//		for(int i=0; i<5; i++) {
//			
//			//executor.execute(new Task());
//			executor.execute(r);
//			
//		}
		
		
		
		
		
//		ExecutorService executorService = Executors.newFixedThreadPool(3);
//		
//		Callable<Integer> callable = () -> {
//			Thread.sleep(3000);
//			return 1;
//		};
//		//Future<Integer> future = executorService.submit(new Task());
//		Future<Integer> future = executorService.submit(callable);
//		try {
//			System.out.println(future.get());
//			System.out.println("after get");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		Runnable r = () -> {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		};
		
		es.execute(r);
		es.shutdown();
		try {
			es.awaitTermination(5, TimeUnit.MICROSECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread completed");
	}

}
