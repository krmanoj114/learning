package com.test.thread;

public class ProducerConsumerSolutionUsingLock {
	
	public static void main(String args[]){
		
		ProducerConsumerImpl sharedObj = new ProducerConsumerImpl();
		
		Producer producer = new Producer(sharedObj);
		
		Consumer consumer = new Consumer(sharedObj);
		
		producer.start();
		consumer.start();
	}

}
