//2. write a program for following task 
//- create a class Animal 
//	- define properties of Animal - name,color,sound,food_type
//	- used encapsulation 
//	- define non-parameterized constructor 
//	- define parameterized constructor  
//	- define a method to accept properties of Animal 
//	- define a method to show properties of Animal 
//- create a class Tiger 
//	- it is sub class of Animal
//	- define properties of Tiger - tiger_type
//	- used encapsulation 
//	- define non-parameterized constructor 
//	- define parameterized constructor  
//	- define a method to accept properties of Tiger 
//	- define a method to show properties of Tiger
//- create a class MainTiger
//	- define main() method 
//	- create a object of Tiger class enter and show data

package Inheritance;

import java.util.Scanner;

public class Animal_4 {

	String name,color;
	  double sound_frequncy ;
	  
	    Animal_4(){
	    	  setname("s");
			  setcolor("d");
			  setsound_frequncy(0);
	    }
	  
        Animal_4(String n,String p,double b){
		  setname(n);
		  setcolor(p);
		  setsound_frequncy(b);
	    } 
      public void ShowDataAnimal() {
    	  System.out.println(" Enter your NAME : "+getname()); 
      	  System.out.println(" Enter your COLOR : "+getcolor()); 
      	  System.out.println(" Enter your SOUND FREQUENCY  : "+getsound_frequncy()); 
        	
        }
        public void AcceptDataAnimal() {
        	Scanner sc=new Scanner(System.in); 

        	System.out.println(" Enter your NAME : ");
        	setname(sc.next());
        	System.out.println(" Enter your COLOR : ");
        	setcolor(sc.next());
        	System.out.println(" Enter your SOUND FREQUENCY  : ");
        	setsound_frequncy(sc.nextDouble());
        }
	  
	  public double getsound_frequncy() {
		  return sound_frequncy ;
	  }
     public String getcolor() {
    	 return color;
	  } 
	  public String getname() {
		 return name;
	  }
	  
      public void setsound_frequncy(double f) {
    	  sound_frequncy=f;
	  }
     public void setcolor(String c) {
		  color=c;
	  } 
	  public void setname(String s) {
		  name=s;
	  }
	  
}
