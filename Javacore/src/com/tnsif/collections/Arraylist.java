package com.tnsif.collections;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String[] args) {
	          ArrayList al=new ArrayList();
	          al.add("Hyderabad");
	          al.add("Mumabai");
	          al.add("Vizag");
	          System.out.println(al);
	          System.out.println(al.get(0));
	          al.remove(1);
	          System.out.println(al);
	          System.out.println(al.size());
	}
}