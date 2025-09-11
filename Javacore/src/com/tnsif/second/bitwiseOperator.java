package com.tnsif.second;

public class bitwiseOperator {

	public static void main(String[] args) {
	int a=6;
	int b=7;
	System.out.println("a&b:"+(a&b));//bitwiseAND
	System.out.println("a|b:"+(a|b));//bitwiseOR
    System.out.println("a^b:"+(a^b));//bitwiseXOR
    System.out.println(~b);//complement
    a&=b;
    System.out.println(a);
	}

}
