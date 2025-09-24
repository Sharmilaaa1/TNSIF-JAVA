package com.tnsif.threads;
public class WaitNotifyEx {
	void waitMethod() {
        synchronized (this) {
            System.out.println("Thread is waiting...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread resumed after notify!");
        }
    }

    void notifyMethod() {
        synchronized (this) {
            System.out.println("Notifying waiting thread");
            notify();
        }
    }
}