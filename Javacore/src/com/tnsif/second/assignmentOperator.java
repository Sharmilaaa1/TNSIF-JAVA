package com.tnsif.second;

public class assignmentOperator {
     public static void main(String[] args) {
    	 int a=10;
    	 int b=23;
    	 a+=b;
    	 System.out.println("Assignmentadiition:"+a);
    	 a-=b;
	     System.out.println("Assignmentsubtraction:"+a);
	     System.out.println("Assignmentmultiplication:"+(a*=b));
	     System.out.println("Assignmentdivision:"+(a/=10));
	     System.out.println("AssignmentModulo:"+(b%=10));

	}

}
