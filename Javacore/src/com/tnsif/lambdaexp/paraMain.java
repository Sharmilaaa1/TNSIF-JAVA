package com.tnsif.lambdaexp;
public class paraMain {
	public static void main(String[] args) {
			withPara w = (a) ->
			{
				System.out.println("The value of a is :" +a);
				return a;	
			};
			
			w.display(9);
	}
}
