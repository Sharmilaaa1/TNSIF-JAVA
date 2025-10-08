package com.tnsif.streamapi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class mainPrgrm {
	public static void main(String[] args) {
	List<Person>p1=new ArrayList<Person>();
	p1.add(new Person("Sharmila",21));
	p1.add(new Person("Indu",29));
	p1.add(new Person("Lalbee",24));
   List<Person>sortedByage =p1.stream()
		   .sorted(Comparator.comparing(p->p.age))
		   .collect(Collectors.toList());
   //print result
   sortedByage.forEach(p->System.out.println(p.name+"-"+p.age));
}
}