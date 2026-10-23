//4. write a program for following task 
//- create a class Vehicle 
//	- define properties of Vehicle - name,color,price,company_name,fule_type
//	- used encapsulation 
//	- define non-parameterized constructor 
//	- define parameterized constructor  
//	- define a method to accept properties of Vehicle 
//	- define a method to show properties of Vehicle 
//- create a class Car 
//	- it is sub class of Vehicle 
//	- define properties of Car - model_name
//	- used encapsulation 
//	- define non-parameterized constructor 
//	- define parameterized constructor  
//	- define a method to accept properties of Car 
//	- define a method to show properties of Car
//- create a class MainCar
//	- define main() method 
//	- create a object of Car class enter and show data


package Inheritance;

import java.util.Scanner;

public class Vehical_5 {
	
    String name , color;
	double price;
	
	Vehical_5(){
  	  setname("s");
		  setcolor("d");
		  setprice(0);
  }

	Vehical_5(String n,String p,double b){
	  setname(n);
	  setcolor(p);
	  setprice(b);
  }
	
	
	 public void ShowDataVehicall() {
		 
   	      System.out.println(" NAME : "+getname()); 
     	  System.out.println(" COLOR : "+getcolor()); 
     	  System.out.println(" PRICE  : "+getprice());  
       }
	 
       public void AcceptDataVehical() {
       	Scanner sc=new Scanner(System.in); 

       	System.out.println(" Enter your NAME : ");
       	setname(sc.next());
       	System.out.println(" Enter your COLOR : ");
       	setcolor(sc.next());
       	System.out.println(" Enter your PRICE : ");
       	setprice(sc.nextDouble());
       }
	 
	 public double getprice() {
		  return price ;
	  }
    public String getcolor() {
   	 return color;
	  } 
	  public String getname() {
		 return name;
	  }
	  
     public void setprice(double f) {
    	 price=f;
	  }
    public void setcolor(String c) {
		  color=c;
	  } 
	  public void setname(String s) {
		  name=s;
	  }
}
