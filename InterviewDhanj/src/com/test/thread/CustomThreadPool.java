package com.test.thread;

import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {
	
	private int poolSize;
	
	private WorkerThread [] workerThreads;
	
	private LinkedBlockingQueue<Runnable> queue;
	
	public CustomThreadPool(int poolSize) {
		this.poolSize = poolSize;
		queue =  new LinkedBlockingQueue<>();
		workerThreads = new WorkerThread[poolSize];
		
		for (int i = 0; i < poolSize; i++) {
			workerThreads[i] = new WorkerThread();
			workerThreads[i].start();
        }
	}
	
	public void execute(Runnable task) {
		synchronized(queue) {
			queue.add(task);
			queue.notify();
			
		}
	}
	
	
	private class WorkerThread extends Thread {
		
		public void run() {
			
			Runnable task;
			
			while(true) {
				synchronized (queue) {
					while(queue.isEmpty()) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					task = queue.poll();
					
				}
				try {
				task.run();
				} catch (Exception e) {
					 System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());
				}
			}
		}
		
	}
	
	 public void shutdown() {
	        System.out.println("Shutting down thread pool");
	        for (int i = 0; i < poolSize; i++) {
	            workerThreads[i] = null;
	        }
	    }
	
	

}
