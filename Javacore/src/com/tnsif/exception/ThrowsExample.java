package com.tnsif.exception;
import java.io.IOException;
public class ThrowsExample {
	static void myMethod() throws IOException {
        throw new IOException("Input/Output error occurred!");
    }

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception.");
    }
}
