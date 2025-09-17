package com.tnsif.inheriance;
class person{
	void show1() {
		System.out.println("I'm a person.");
	}
}
class student extends person{
	void show2(){
		System.out.println("I'm a student.");
		
	}
}
class Teacher extends person{
	void show3() {
		System.out.println("I'm a teacher.");
	}
}
class study extends student{
	void show4() {
		System.out.println("I'm studying Btech.");
	}
}
public class Hybrid {
	public static void main(String[] args) {
		study s=new study();
		s.show1();
		s.show2();
		s.show4();
		Teacher t=new Teacher();
		t.show1();
		t.show3();
	}
	

}
