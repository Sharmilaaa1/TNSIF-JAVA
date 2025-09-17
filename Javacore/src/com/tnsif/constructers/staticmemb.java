package com.tnsif.constructers;
class staticvar {
 static int a=100;
	static public void method() {
	System.out.println("This is a static variable"+a);
	System.out.println("This is a stactic method");
}
 void Static(){
	System.out.println("This is a static block");
}	
}
public class staticmemb {
	public static void main(String[] args) {
	staticvar ss=new staticvar();
	ss.Static();
	staticvar.method();
	}
}
