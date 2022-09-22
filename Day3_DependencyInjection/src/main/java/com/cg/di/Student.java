package com.cg.di;

//1.Dependency in terms of literals
public class Student {
	
	//variable
	private String StudentName;
	private int rollno;

	//DI using constructor
	//constructor
	public Student(String studentName, int rollno) {
		super();
		StudentName = studentName;
		this.rollno = rollno;
	}

	
	/*
	
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}*/
	//userDefined method
	public void display()
	{
		System.out.println("STUDENTNAME IS :"+StudentName+" "+"AND ROLL NO IS: "+rollno);
	}	

}