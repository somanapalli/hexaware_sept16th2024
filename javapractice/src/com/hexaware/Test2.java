package com.hexaware;

public class Test2 {
	
	//class level variables
	int stid;
	String stname;
	
	//parameterized constructor
	public Test2(int stid, String stname)
	{
		//initialization logic 
		this.stid = stid;
		this.stname= stname;
		//call getStudentInfo()
		this.getStudentInfo();
		
	}
	//default constructor
	public Test2()
	{
		//call current class parameterized constructor
		this(2,"rk");
		System.out.println("default");
		
	}
	public void getStudentInfo()
	{
		System.out.println("student id : " + this.stid);
		System.out.println("student name: " + this.stname);
	}
	public static void main(String[] args) {
		
		
		
		Test2 obj1 = new Test2();
		
	}
	
	

}
