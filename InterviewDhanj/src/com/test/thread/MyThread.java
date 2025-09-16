package com.test.thread;

public class MyThread extends Thread {
	
	public MyThread(String name) {
		super(name);
	}

	public void run(){
		
		System.out.println("Strat:"+Thread.currentThread().getName());
		
		try{
			
			Thread.sleep(1000);
			doProcess();
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
		System.out.println("End:"+Thread.currentThread().getName());
	}
	
	private void doProcess() throws InterruptedException{
		Thread.sleep(1000);
	}
	
	public static void main(String args[]){
		
		Thread t1 = new MyThread("t1");
		Thread t2 = new MyThread("t2");
		t1.start();
		t2.start();
		
		
		
	}
	
	

}
