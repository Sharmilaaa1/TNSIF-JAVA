package com.tnsif.exception;
public class tryCatch {
	    public static void main(String[] args) {
	        try {
	            int a = 10, b = 0;
	            int c = a / b; 
	            System.out.println("Result: " + c);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed!");
	        }
	    }
	}