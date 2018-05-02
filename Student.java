package studentDatabaseApp;

import java.util.Scanner;

public class Student
{
     public String  firstName;
     public String  lastName;
     public int gradeyear;
     public String  studentID;
     public String  courses;
     public int tutionBalance;
     public static int costofCourse=600;
     public static int id=1000;
	
	//constuctors user to enter their details
		Scanner in=new Scanner(System.in);

	public Student()
	{

		System.out.println("enter a student first name");
		this.firstName=in.nextLine();
		
		System.out.println("enter a student last name");
		this.lastName=in.nextLine();
		
		System.out.println("enter a student grade year  level \n1-fresher \n 2-junior \n 3-sinior ");
		this.gradeyear=in.nextInt();

		
	}
	
	//Generate an ID
	public void setstudentID() 
	{
		id++;
		this.studentID=gradeyear+""+id;
		
	}
	
	//Enroll courses
	public void enroll()
	{
		do
		{
			System.out.println("enter courses to enroll or (press q to quit) ");
			String course=in.nextLine();
			
			if(!course.equals("q"))
			{
				courses = courses +"\n"+course;
				tutionBalance=tutionBalance+costofCourse;
			}
			else
			{
				break;
			}
			
		}
		while(1!=0);
		
		
	}
	
	//view balance
	public void viewbal()
	{
		System.out.println("tutionBalance  = $"+tutionBalance);
	}
	
	
	
	//pay tution fee
	public void payTution()
	{ 
		viewbal();
		System.out.println("enter a amount to pay");
		int payment=in.nextInt();
		tutionBalance=tutionBalance-payment;
		System.out.println("thank you for your payment    $"+payment);
		viewbal();
	}
	
	
	//show status
	
	public String toString()
	{
		return "Name ="+firstName+""+lastName+
				"\n gradelevel ="+gradeyear+
				"\n studentID ="+studentID+
				"\n courses list = "+courses+
				"\n tution balance $="+tutionBalance;
	}
	
	
	
	
}
