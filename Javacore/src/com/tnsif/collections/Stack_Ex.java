package com.tnsif.collections;
import java.util.Stack;
public class Stack_Ex {
	public static void main(String[] args) {
	     Stack s=new Stack(); 
	     s.push("abc"); 
	     s.push(10); 
	     s.push(true); 
	     s.push("abc"); 
	     s.push(null); 
	     System.out.println(s); 
	     s.pop(); 
	     System.out.println(s); 
	     System.out.println(s.peek()); 
	     System.out.println(s); 
	     } 
	} 