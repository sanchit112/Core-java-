//- - Create a class Metal
//	- define properties of Metal - name,color,boiling_point,melting_point
//	- used encapsulation 
//	- define non-parameterized constructor 
//	- define parameterized constructor  
//	- define a method to accept properties of Metal 
//	- define a method to show properties of Metal 
//     ********
//- - Create a class Iron 
//	- it is a sub class of Metal
//	- define properties of Iron - geo_location; 
//	- used encapsulation 
//	- define non-parameterized constructor 
//	- define parameterized constructor  
//	- define a method to accept properties of Iron 
//	- define a method to show properties of Iron
//	- define a method to show used of Iron
//        ********
//- - Create a class MainIron
//	- define main() method 
//	- create a object of Iron class enter and show data


package Inheritance;

import java.util.Scanner;

public class Metal_3 {

	public String Name,color;
	  double boiling_point; 
	  
	
	  public   Metal_3 () {
		  
	  }

	  public  Metal_3 (String s, String c,double b) {
		  setname(s);
		  setcolor(c);
		  setboiling_point(b);
		  
	  }
	  public void ShowMetal() {
		  System.out.println(" NAME : "+getname()+" COLOR : "+getcolor()+
				  " BOILING POINT : "+getboiling_point());
		  
	  }
	  
	  public void AcceptMetal() {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println(" Enter your NAME : ");
		  setname(sc.next());
		  
		  System.out.println(" Enter your COLOR : ");
		  setcolor(sc.next());
		  
		  System.out.println(" Enter your BOILING POINT : ");
		  setboiling_point(sc.nextDouble());
		  
	  }
	   
	  public double getboiling_point (   ) {	  
		  return boiling_point ;
	  }
	  public String getcolor(   ) {
		  return color ; 
	  }
	  public  String getname( ) {
		return Name ; 
	  }
	  
	  
	  public void setboiling_point (double b) {	  
	       boiling_point=b;
	  }
	  public void setcolor(String c) {
		  color=c; 
	  }
	  public void setname(String s) {
		 Name=s; 
	  }
	  
	
}
