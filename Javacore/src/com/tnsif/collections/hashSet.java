package com.tnsif.collections;
import java.util.HashSet;
public class hashSet {
	public static void main(String[] args) {
	     HashSet<String>h=new HashSet<String>();
         h.add("ramu"); 
         h.add("priya"); 
         h.add("sree"); 
         h.add("sree"); 
         System.out.println(h); 
         h.remove("priya"); 
         System.out.println(h); 
	}
}
