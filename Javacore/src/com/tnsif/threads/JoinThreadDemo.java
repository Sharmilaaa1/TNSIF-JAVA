package com.tnsif.threads;
public class JoinThreadDemo {
	public static void main(String[] args) {
		ThreadJoin tj=new ThreadJoin();
		tj.start();
		try {
			tj.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Main thread is finished after child thread");
	}
}
