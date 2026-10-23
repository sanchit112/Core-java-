package Array;

import java.util.Scanner;

public class Student {
	 
	private String Name;
	private int Age;
	
	int a[]=new int[5];
	
	
	
	public Student() {
		setAge(1);
		setName("sanchit");
	}
	
	
	 public  Student(String n, int a) {
		setName(n);
		 setAge(a);;
	}
	
	 public void ShowStudentdata() {
		 
		 System.out.println(" Name : "+getName());
		 System.out.println(" Age : "+getAge());
	 }
	 
	 
	public void AcceptStudentdata() {
		
		Scanner scanner=new Scanner(System.in);
		
	     System.out.println(" Enter your Name : ");
	     setName(scanner.next());
	     System.out.println(" Enter your Age : ");
	     setAge(scanner.nextInt());
	}
	
	
	
	//getter method 
	
	public int getAge() {
		return Age;
	}
	
	public String getName() {
	  return Name;
	}
	
	

	//setter method 
	
   public void setAge(int a) {
	   Age=a;   
   }
	
	public void setName(String n) {
		Name=n;	
	}
	
}	