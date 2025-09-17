package com.tnsif.constructers;
class sample{
	int x=1,y=2,z=3;
	sample(){
		System.out.println("This is a constructor");
	}
	public void show() {
		int volume=x*y*z;
		System.out.println(volume);
	}
}
public class DefaultConstruct {
	public static void main(String[] args) {
		sample s=new sample();
		s.show();
	}
}
