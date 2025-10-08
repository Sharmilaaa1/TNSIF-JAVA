package com.tnsif.lambdaexp;
import java.util.ArrayList;
public class Lambdacoll {	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();		
				l.add(201);
				l.add(202);
				l.add(203);
				l.add(204);
				l.add(205);
				l.forEach(n->System.out.println(n));
}
}