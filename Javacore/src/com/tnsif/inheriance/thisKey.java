package com.tnsif.inheriance;
class Hello{
	int x=10;
	public void demo() {
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
	}
}

public class thisKey {

	public static void main(String[] args) {
		Hello h=new Hello();
		h.demo();
	}

}
