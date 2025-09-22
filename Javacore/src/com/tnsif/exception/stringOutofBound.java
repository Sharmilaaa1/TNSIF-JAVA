package com.tnsif.exception;
public class stringOutofBound {
	public static void main(String[] args) {
		 try {
	            String text = "Hello";
	            
	            // Trying to access index 10 (not available in "Hello")
	            char ch = text.charAt(10); 
	            
	            System.out.println("Character: " + ch);
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: Tried to access invalid index in String.");
	            System.out.println("Exception Message: " + e.getMessage());
	        }

	        System.out.println("Program continues after handling exception.");
	    }
	}