package Inheritance;

import java.util.Scanner;

public class Student_2 extends Person_2{

	 
	String Course;
	int id;
	
	Student_2 (){
   	   AcceptDataStu();
   	   ShowDataStu();
     }
     
	Student_2 (String n, int a){
   	  setCourse(n);
   	  setid(a);
     } 
	
	 public void ShowDataStu() {
		 ShowData();
   	  System.out.println(" Enter your COURSE : "+getCourse());
   	  System.out.println(" Enter your ID : "+getid()); 
     }
     
     public void AcceptDataStu() {
    	 AcceptData();
   	  Scanner sc=new Scanner(System.in);
   	  
   	  System.out.println(" Enter your COURSE : ");
   	  setCourse(sc.next());
   	  System.out.println(" Enter your ID : ");
   	  setid(sc.nextInt());
     }
	 
	
	public int getid() {
  	  return id;
    }
    public String getCourse() {
  	  return Course;
    }
    public void setid(int a) {
    	id=a;
    }
	public void setCourse(String s) {
		Course=s;
	}
  
	
	
}
