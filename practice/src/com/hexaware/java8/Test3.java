package com.hexaware.java8;

import java.util.ArrayList;

public class Test3 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}

		// boolean test(T t);
		// void accept(T t);
		al.stream()
		   .filter(x -> x%2==0)
		   .forEach(x->System.out.println(x));
		
		
	}

}
