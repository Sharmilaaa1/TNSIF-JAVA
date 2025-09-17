package com.tnsif.inheriance;
import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter employee name:");
		String name=input.nextLine();
		System.out.println("Enter employee id:");
		int id=input.nextInt();
		System.out.println("Enter employee Salary");
		double salary=input.nextDouble();
		System.out.println("Enter Employee Location:");
		String location=input.next();
		
		
	}

}
