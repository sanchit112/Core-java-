//---create a class Employee 
//	- define a properties of Employee 
//	- properties -> id,name,salary,age,post
//	- used encapsulation 
//	- define a non-parameterized constructor 
//	- define a parameterized constructor 
//	- define a method to accept properties 
//	- define a method to show properties 
//  - define a a method to sort customer by subscription_amount from higher to lower 
//	- define a a method to sort customer by subscription_amount from lower to  higher
//
//--- create a class EmployeeMain 
//	- define a main() method 
//	- create 1 object of Employee class and call method
//  - call array method 

package Array_Sorting;

import java.util.Scanner; 

public class Empolye {
  
		private static int Id;
		private static String Name;
		private static double Salary;
		
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
	 //  Array sorting 
	    public static void sortEmpolyeeArray() {
	    	
	    	    for(int i=0; i<emp1.length;i++) {
	    	       for(int j=i+1;j<emp1.length;j++) {
	    	       	 
	    	      	 if(emp1[i].getSalary()>emp1[j].getSalary()) {
	    	       	     Empolye e=emp1[i];
	    	       		  emp1[i]=emp1[j];
	    	       		  emp1[j]=e;
	    	       } 
	    	   }
	       } 
	   }
	    
	 // Method Array show
	    
	    public static void ShowEmpolyeArray() {
	 
	    	// for each loop 
	    	for(Empolye emp : emp1) {
	    		 emp.ShowEmpolyeData();
	    	}
	    } 
	 //   Method   
	    public static void AcceptEmpolyeArray() {
	    	
	    	for(int k=0;k<emp1.length;k++) {
	    		
	    		emp1[k]= new Empolye();
	    		emp1[k].AcceptEmpolyeData();
	    	}
	    }  
	    
	 //  Method
	    public static void ShowEmpolyeData() {
	    	
	    	System.out.println(" ID : "+getId());
	    	System.out.println(" Name : "+getName());
	    	System.out.println(" Salary : "+getSalary());
	    }
	    
	//  Method 
	    public  static void AcceptEmpolyeData() {
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
		public static double getSalary() {
			return Salary;
		}
			public static String getName() {
			return Name ;
		}
		public static int getId() {
			return Id ;
		}
		
	// setter method 
		public static void setSalary(double s) {
			Salary=s;
		}
			public static void setName(String b) {
			Name=b;
		}
		public static void setId(int i) {
			Id=i;
		}
	}
