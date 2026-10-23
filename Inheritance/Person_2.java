//-: create a class Person 
//	- name,age,city,gender
//	- used encapsulation 
//	- define a non-parameterized constructor 
//	- define a parameterized constructor 
//	- define a method to accept properties 
//	- define a method to show properties 
//
//- create a class Student
//	- it is a sub class of Person 
//	- id, collage_name, course, year 
//	- used encapsulation 
//	- define a non-parameterized constructor 
//	- define a parameterized constructor 
//	- define a method to accept properties 
//	- define a method to show properties 
//
//- create a class StudentMain
//	- define a main() method 
//	- create object of Student class and call method
 

package Inheritance;

import java.util.Scanner;

public class Person_2 {
	
	
	  String name;
      int age;
      
      Person_2(){
    	  setname("s");
    	  setage(0);
      }
      
      Person_2(String n, int a){
    	  setname(n);
    	  setage(a);
      }
      
      public void ShowData() {
    	  System.out.println(" Enter your NAME : "+getname());
    	  System.out.println(" Enter your AGE : "+getage()); 
      }
      
      public void AcceptData() {
    	  Scanner sc=new Scanner(System.in);
    	  
    	  System.out.println(" Enter your NAME : ");
    	  setname(sc.next());
    	  System.out.println(" Enter your AGE : ");
    	  setage(sc.nextInt());
      }
      
      
      public int getage() {
    	  return age;
      }
      public String getname() {
    	  return name;
      }
      public void setage(int a) {
    	  age=a;
      }
	public void setname(String s) {
		name=s;
	}
}
