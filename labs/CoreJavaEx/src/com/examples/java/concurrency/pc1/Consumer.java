package com.examples.java.concurrency.pc1;

/**
 * Thread Example
 * Consumer with wait & notify
 *
 */
public class Consumer implements Runnable{
	private Buffer buffer;
	
	public Consumer(Buffer b) {
		buffer = b;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " -->Start Running thread");
		while(true) {
			try {
				while(!buffer.hasValue()) {
					synchronized(buffer) {
						buffer.wait();
					}
				}
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " interrupted");
				break;
			}
			double d = buffer.getValue();
			System.out.println(Thread.currentThread().getName() + " consumed " + d);
			synchronized(buffer) {
				buffer.notify();
			}
		}
		System.out.println(Thread.currentThread().getName() + " -->Stop thread");
	}
}
