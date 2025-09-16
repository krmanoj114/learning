package com.test.thread;

public class EvenOddThreadExample implements Runnable{
	
	
	static int number=1;
	
	int remainder;
	
	static Object lock = new Object();
	
	public EvenOddThreadExample(int remainder) {
		
		this.remainder = remainder;
	}

	@Override
	public void run() {
		  
		while(number < 100) {
			
			synchronized(lock) {
				
				while(number%2 != remainder) {
					try {
						lock.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
			}
		}
		
	}
	
	public static void main(String args[]) {
		EvenOddThreadExample oddRunnable=new EvenOddThreadExample(1);
		EvenOddThreadExample evenRunnable=new EvenOddThreadExample(0);
 
        Thread t1=new Thread(oddRunnable,"Odd");
        Thread t2=new Thread(evenRunnable,"Even");
 
        t2.start();
        t1.start();
        
	}

}
