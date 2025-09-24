package com.tnsif.threads;
public class JoinThreadDemo {
	public static void main(String[] args) {
		ThreadJoin tj1=new ThreadJoin();
		tj1.start();
		try {
			tj1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Main thread is finished after child thread");
	}
}
