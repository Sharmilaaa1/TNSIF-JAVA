package com.tnsif.constructers;
class show1{
	public void demo() {
		System.out.println("This has 0 parameters");
	}
	public void demo(int a) {
		System.out.println("This has 1 parameter:"+a);
	}
	public void demo(int a,int b) {
	         System.out.println("This has 2 parameters:"+a + "and " +b);	
	}
}
public class methodoverload {
	public static void main(String[] args) {
	show1 s1=new show1();
	s1.demo();
	s1.demo(10);
	s1.demo(10,20);
	}
}