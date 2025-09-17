package com.tnsif.constructers;
class demo{
	public void dispaly(int a) {
		System.out.println("This has a int parameter");
	}
	public void display(float b) {
		System.out.println("This has a float parameter");
	}
}
class demo1{
	public void display1(int x,String y) {
		System.out.println("This is a method with int and String values:"+x+"and"+y);
	}
	public void display1(String x,int y) {
		System.out.println("This is a method with String and int values:"+x+"and"+y);		
	}	
}
public class methodoverload1 {
	public static void main(String[] args) {
	      demo d=new demo();
	      d.display(10);
	      d.display(20);
	      demo1 d1=new demo1();
	      d1.display1(10,"java");
	      d1.display1("python",20);      
	}
}