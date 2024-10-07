package com.hexaware.java8;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test5 {
	
	// int compare(T o1, T o2);

	public static void main(String[] args) {
		
		SortedSet<Student> s = new TreeSet<>((x,y) -> y.getStname().compareTo(x.getStname()));
		
		Student priyanshu = new Student(100,"priyanshu");
		Student krishna = new Student(898,"krishna");
		Student sakshi = new Student(78,"sakshi");
		s.add(priyanshu);
		s.add(krishna);
		s.add(sakshi);
		
		
		System.out.println(s);
	}

}
