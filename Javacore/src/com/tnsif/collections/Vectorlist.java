package com.tnsif.collections;
import java.util.*;
public class Vectorlist {
	public static void main(String[] args) {
	        Vector<String> V=new Vector<String>();
	        V.addElement("Hyderabad");
	        V.addElement("Mumbai");
	        V.add("Khammam");
	        System.out.println(V);
	        V.remove(1);
	        System.out.println(V.get(0));
	}
}