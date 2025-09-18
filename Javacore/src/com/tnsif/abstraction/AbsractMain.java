package com.tnsif.abstraction;

public class AbsractMain {

	public static void main(String[] args) {
		square s=new square(4);
		s.calArea();
		s.show();
		rectangle r=new rectangle(4,5);
		r.calArea();
		r.show();	
	}
}