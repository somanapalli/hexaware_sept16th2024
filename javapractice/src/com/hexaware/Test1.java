package com.hexaware;

public class Test1 {
	
	
	//non static variables
    int stid =100;
	String stname="Rk";
	double stmarks = 98.5;
	static String collegeName= "CBIT";
	
	
	//non static method or instance method
	public void getStudentInfo()
	{
		//non-static area
		System.out.println("student id is: " + stid);
		System.out.println("student name is: " + stname);
		System.out.println("student marks are: " + stmarks);
		System.out.println("student collegename is: " +Test1.collegeName);
	}
	
	
	public static void main(String[] args) {
		//static area
		new Test1().getStudentInfo();
		
	}
}
