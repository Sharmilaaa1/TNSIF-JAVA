package com.tnsif.abstraction;

public class rectangle extends Shape {
	private int height=2,width=10;
	public rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
        void calArea() {
        	super.area=height*width;
        }
}
