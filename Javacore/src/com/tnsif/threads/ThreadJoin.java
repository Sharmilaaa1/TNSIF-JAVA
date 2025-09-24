package com.tnsif.threads;
public class ThreadJoin extends Thread {
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("This is Child Thread:"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
