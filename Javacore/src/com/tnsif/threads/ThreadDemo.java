package com.tnsif.threads;
//program for multithreading by extends thread class
public class ThreadDemo extends Thread {
	 public void run() {
		 for(int i=0;i<10;i++) {
			 try {
				 System.out.println("This is thread");
				 System.out.println(Thread.currentThread());
				 Thread.sleep(2000);
			 }catch(Exception e) {
				 System.out.println(e);
			 }
				 
			 }
		 }
}