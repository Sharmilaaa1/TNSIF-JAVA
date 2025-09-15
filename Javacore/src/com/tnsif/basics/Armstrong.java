package com.tnsif.basics;

public class Armstrong {

	public static void main(String[] args) {
		int num=123;
		int copy=num;
		int result=0;
		int n=String.valueOf(num).length();
		while(num>0) {
			int digit=num%10;
			result+=Math.pow(digit, n);
			num/=10;
		}
		if(result==copy) {
			System.out.println(+copy+"is an Armstrong number");
		}else
			System.out.println(+copy+"is not an Armstrong number");
		}
	}

