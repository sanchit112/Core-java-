package Method;

import java.util.Scanner;

public class Student_1 {

	 
		int rollNo;
		String student_name;	
		int sub1,sub2,sub3, sub4 , sub5;
		
			
		  
		public void showStudentData() {
			
			System.out.println(" ROLL_No "+rollNo);
			System.out.println(" Student Name "+student_name);
			System.out.println(" HTML "+sub1);
			System.out.println(" CSS "+sub2);
			System.out.println(" JAVA "+sub3);
			System.out.println(" PYTHON "+sub4);
			System.out.println(" ENGLISH "+sub5);
		}
		
		public void acceptstudent() {
			
			Scanner scanner=new  Scanner(System.in);
			System.out.println("Enter Roll Number");
			rollNo=scanner.nextInt();
			System.out.println("Enter Student Name ");
			student_name=scanner.next();
		    System.out.println(" Enter 5 subject name");
		    sub1=scanner.nextInt();
		    sub2=scanner.nextInt();
		    sub3=scanner.nextInt();
		    sub4=scanner.nextInt();
		    sub5=scanner.nextInt();
		    
		    
	}
}
