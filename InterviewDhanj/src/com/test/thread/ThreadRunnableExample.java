package com.test.thread;

public class ThreadRunnableExample implements Runnable{
	
	
	
	
	public static void main(String args[]){
		
		Thread t1 = new Thread(new ThreadRunnableExample(), "t1");
		Thread t2 = new Thread(new ThreadRunnableExample(), "t2");
		t1.start();
		t2.start();
		
	}

	public void run() {
		
		System.out.println("Start:"+Thread.currentThread().getName());
		
		try{
			
			Thread.sleep(1000);
			
			processData();
			
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		
		System.out.println("End:"+Thread.currentThread().getName());
	}
	
	private void processData() throws InterruptedException{
		Thread.sleep(1000);
	}

}
