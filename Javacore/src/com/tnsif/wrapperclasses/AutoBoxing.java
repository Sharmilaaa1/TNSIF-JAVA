package com.tnsif.wrapperclasses;
public class AutoBoxing {
		    public static void main(String[] args) {
		        // Example 1: int → Integer
		        int a = 111;
		        Integer obj1 = a;   
		        System.out.println("Autoboxing int to Integer: " + obj1);
		        // Example 2: char → Character
		        char ch = 'B';
		        Character obj2 = ch; 
		        System.out.println("Autoboxing char to Character: " + obj2);
		        // Example 3: double → Double
		        double d = 56.65;
		        Double obj3 = d;   
		        System.out.println("Autoboxing double to Double: " + obj3);
	}
}