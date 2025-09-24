package com.tnsif.threads;
public class PriorityDemo extends Thread {
	public void run() {
		System.out.println("The running Thread is:"+Thread.currentThread().getName());
		System.out.println("The running thread priority is:"+Thread.currentThread().getPriority());
	}
}