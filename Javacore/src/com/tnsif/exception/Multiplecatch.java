package com.tnsif.exception;
public class Multiplecatch {
	 public static void main(String[] args) {
	        try {
	            // Code that may throw different exceptions
	            int[] numbers = {10, 20, 30};
	            int result = numbers[1] / 0;   // ArithmeticException
	            System.out.println("Result: " + result);
	            System.out.println("Element: " + numbers[5]); // ArrayIndexOutOfBoundsException
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index is out of bounds.");
	        } 
	        catch (Exception e) {
	            System.out.println("General Exception: " + e.getMessage());
	        }

	        System.out.println("Program continues after exception handling.");
	    }
	}