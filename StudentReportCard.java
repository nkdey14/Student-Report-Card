package Exercise2;

import java.util.Scanner;

public class StudentReportCard {
	
	// Created non-static variables
	
	String name, rollNo;
	
	String grade, section;
	
	int marks_Math, marks_English, marks_Science, marks_History, marks_Geography, marks_Hindi, marks_Computer;
	
	int total_marks = 700;
	
	int marks_per_sub = 100;
	
	int marks_secured = 0;
	
	int sub_count = 7;
	
	double avg_marks = 0.0;
	
	double perc_marks = 0.0;
	
	// used parameterized constructor to initialize values of the non-static variables
	
	public StudentReportCard (String n, String r, String g, String s, int my_m, int my_e, int my_s, int my_ht, int my_g, int my_hn, int my_co)
	{
		name = n;
		
		rollNo = r;
		
		grade = g;
		
		section = s;
		
		marks_Math = my_m;
		
		marks_English = my_e;
		
		marks_Science = my_s;
		
		marks_History = my_ht;
		
		marks_Geography = my_g;
		
		marks_Hindi = my_hn;
		
		marks_Computer = my_co;
		
		marks_secured = marks_Math + marks_English + marks_Science + marks_History + marks_Geography + marks_Hindi + marks_Computer;
		
		avg_marks = marks_secured/sub_count;
		
		perc_marks = (double)(avg_marks/marks_per_sub)*100;
	}
	
	// method used for finding the grade of the student
	
	public void findGrade() 
	{
		if(perc_marks >= 90 && perc_marks <= 100)
		{
			System.out.println("Grade: A");
		}
		else if(perc_marks >= 80 && perc_marks <= 89)
		{
			System.out.println("Grade: B");
		}
		else if(perc_marks >= 70 && perc_marks <= 79)
		{
			System.out.println("Grade: C");
		}
		else if(perc_marks >= 60 && perc_marks <= 69)
		{
			System.out.println("Grade: D");
		}
		else if(perc_marks >= 50 && perc_marks <= 59)
		{
			System.out.println("Grade: E");
		}
		else
		{
			System.out.println("Result: Fail");
		}
		
	}
	
	// method used for displaying the student report card
	
	public void display()
	{
		System.out.println("--------------------------------------- Student Report Card -------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------------------"+ "\n");
		
		System.out.println(" Student name: "+ name + "\t\t\t" + " Roll No: "+ rollNo + "\n\n" + " Class: "+ grade + "\t\t\t\t" + " Section: " + section + "\n\n" + " Marks in Math: "+ marks_Math + "\n\n" + " Marks in English: "+ marks_English + "\n\n" + " Marks in Science: "+ marks_Science + "\n\n" + " Marks in History: "+ marks_History + "\n\n" + " Marks in Geography: "+ marks_Geography + "\n\n" + " Marks in Hindi: "+ marks_Hindi + "\n\n" + " Marks in Computer: "+ marks_Computer);
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println(" Full Marks = " + total_marks + "\t\t\t" + " Marks Secured = " +  marks_secured + "\n\n"+ " Percentage: "+ perc_marks);
		
		System.out.print("\n"+" ");
		
		// calling the findGrade() to display student's grade
		
		findGrade();
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		
		// Taking input from the user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String my_name = sc.nextLine();
		
		System.out.println("Enter your roll no: ");
		
		String my_rollno = sc.nextLine();				
		
		System.out.println("Enter your class: ");
	
		String my_class = sc.nextLine();
		
		System.out.println("Enter your section: ");
		
		String my_sec = sc.next();
		
		System.out.println("Enter your mark in Math: ");
		
		int my_m = sc.nextInt();
		
		System.out.println("Enter your mark in English: ");
		
		int my_e = sc.nextInt();
		
		System.out.println("Enter your mark in Science: ");
		
		int my_s = sc.nextInt();
		
		System.out.println("Enter your mark in History: ");
		
		int my_ht = sc.nextInt();
		
		System.out.println("Enter your mark in Geography: ");
		
		int my_g = sc.nextInt();
		
		System.out.println("Enter your mark in Hindi: ");
		
		int my_hn = sc.nextInt();
		
		System.out.println("Enter your mark in Computer: ");
		
		int my_co = sc.nextInt();
		
		// passing the local variables as arguments to the Constructor
		
		StudentReportCard s = new StudentReportCard(my_name, my_rollno, my_class, my_sec, my_m, my_e, my_s, my_ht, my_g, my_hn, my_co);
		
		
	//	s.getValues(my_name, my_rollno, my_class, my_sec, my_m, my_e, my_s, my_ht, my_g, my_hn, my_co);
		
		// printing the final report card
		
		s.display();
		

	}

}
