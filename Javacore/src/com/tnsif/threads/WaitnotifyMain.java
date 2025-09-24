package com.tnsif.threads;
public class WaitnotifyMain {
	public static void main(String[] args) {
	        WaitNotifyEx obj = new WaitNotifyEx();
	        Thread t1 = new Thread(() -> obj.waitMethod());
	        t1.start();
	        try {
	            Thread.sleep(1000); // give t1 time to call wait()
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        obj.notifyMethod(); // main thread notifies t1
	}
}