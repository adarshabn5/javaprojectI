package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp
{

	public static void main(String[] args) 
	{
		//Student student=new Student();
		
		
		//enter how many students to add
		System.out.println("enter how many new students to enter");
		Scanner in=new Scanner(System.in);
		int noOfStudent=in.nextInt();
		Student[] students=new Student[noOfStudent];
		
		for(int i=0;i<noOfStudent;i++)
		{
			students[i]=new Student();
			students[i].setstudentID();
			students[i].enroll();
			students[i].payTution();
			System.out.println(students[i].toString());
		}
		
		
		//create n number of student objects
	}
	
	
}
