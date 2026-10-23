//---create a class Employee 
//	- define a properties of Employee 
//	- properties -> id,name,salary,age,post
//	- used encapsulation 
//	- define a non-parameterized constructor 
//	- define a parameterized constructor 
//	- define a method to accept properties 
//	- define a method to show properties 
//
//---create a class EmployeeMain 
//	- define a main() method 
//	- create 1 object of Employee class and call method

package Array;

import java.util.Scanner;

public class Empolye {

	private int Id;
	private String Name;
	private double Salary;
	
private static Empolye emp1[]=new Empolye[2];
	
//  constructor 

	public Empolye() {
		setId(1212);
		setName("san");
		setSalary(48651);
	}
	
// parameterized constructor 
	
    public Empolye(int a, String n, double p) {
		setId(a);
		setName(n);
		setSalary(p);
	} 
   
 // Method Array show
    
    public void ShowEmpolyeArray() {
 
    	// for each loop 
    	for(Empolye emp : emp1) {
    		 emp.ShowEmpolyeData();
    	}
    } 
 //   Method   
    public void AcceptEmpolyeArray() {
    	
    	for(int k=0;k<emp1.length;k++) {
    		
    		emp1[k]= new Empolye();
    		emp1[k].AcceptEmpolyeData();
    	}
    }  
    
 //  Method
    public void ShowEmpolyeData() {
    	
    	System.out.println(" ID : "+getId());
    	System.out.println(" Name : "+getName());
    	System.out.println(" Salary : "+getSalary());
    }
    
//  Method 
    public void AcceptEmpolyeData() {
    	// New Object 
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println(" Enter Your Id : ");
    	setId(sc.nextInt());
    	System.out.println(" Enter Your Name : ");
    	setName(sc.next());
    	System.out.println(" Enter Your Salary : ");
    	setSalary(sc.nextDouble());
    }
    
	
// getter method 
	public double getSalary() {
		return Salary;
	}
		public String getName() {
		return Name ;
	}
	public int getId() {
		return Id ;
	}
	
// setter method 
	public void setSalary(double s) {
		Salary=s;
	}
		public void setName(String b) {
		Name=b;
	}
	public void setId(int i) {
		Id=i;
	}
}
