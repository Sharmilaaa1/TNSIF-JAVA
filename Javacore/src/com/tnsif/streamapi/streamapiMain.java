package com.tnsif.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class streamapiMain {
	public static void main(String[] args) {
	     List<streamapiexample>s=new ArrayList<streamapiexample>();
	     s.add(new streamapiexample(1,"hp",32000f));
	     s.add(new streamapiexample(2,"Dell",52000f));
	     s.add(new streamapiexample(3,"Asus",40000f));
	     s.add(new streamapiexample(4,"Lenovo",49000f));
	 List<Float>s2=s.stream().filter(p->p.price>40000)//filtering data
			 .map(p->p.price)//fetching price
			 .collect(Collectors.toList()); //collecting as list
	 System.out.println(s2);	 
	}
}