package com.tnsif.constructers;
class keys{
	final int a=10;
	final public void show() {
		System.out.println("This is final method");
		System.out.println("This is a final variable"+a);
	}
}
public class Finalkey {
	public static void main(String[] args) {
		keys k=new keys();
		k.show();
	}

}
