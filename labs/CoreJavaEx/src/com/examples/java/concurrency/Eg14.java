package com.examples.java.concurrency;

/**
 * Thread Examples
 * Daemon
 *
 */
public class Eg14 {
	public class CpuInternsiveJob extends Thread {
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " starting >>>");
			System.out.flush();
			int x;
			for(int i=0; i <100000; i++) {
				for(int j=0; j<100000; j++) {
					 x = i + j;
				}
			}
			System.out.println(Thread.currentThread().getName() + " stopping");
			System.out.flush();
		}
	}
	
	public static void main(String[] args) {
		Eg14 e = new Eg14();
		Thread t1 = e.new CpuInternsiveJob();
//		t1.setDaemon(true);
		t1.start();

	}
}
