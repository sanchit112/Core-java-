
// create a class Jiosaavn 
//- define a properties of Jiosaavn 
//- properties -> id,name,subscription_amount,language
//- ussed encapsulation 
//- define a non-parameterized constructor 
//- define a parameterized constructor 
//- define a method to accept properties 
//- define a method to show properties
//- define a Array 
//- Define a method to Accept Array prperties 
//-define a method to show Array properties
//-
//- create a class JiosaavnMain 
//- define a main() method 
//- create 1 object of Jiosaavn class and call method 

package Array;

import java.util.Scanner;

public class JioSavaan {
	
	private int Id;
	private String Name;
	private double Amount;
	
	private static JioSavaan a[]=new JioSavaan[1];
	
	
	public JioSavaan() {
		setId(0);
		setName("s");
		setAmount(78);
	}
	
	 
	
	public JioSavaan(int i,String s,Double d) {
		setId(i);
		setName(s);
		setAmount(i);
	}
	
	public void ShowJioArray() {
		for(JioSavaan a1: a) {
			a1.ShowJio();
		}
	}
	
	public void AcceptJioArray() {
		
		for(int b=0; b<a.length; b++) {
			   a[b]=new JioSavaan();
			   a[b].AcceptJio();
		}
	}
	
	
	public void ShowJio() {
		System.out.println(" Enter Your Id : "+getId());
		System.out.println(" Enter Your Name : "+getName());
		System.out.println(" Enter Your Amount : "+getAmount());
		
	}
	 
	public void AcceptJio() {
		Scanner sc=new Scanner(System.in);
		
		 System.out.println(" Enter Your Id : ");
	     setId(sc.nextInt());
	     System.out.println(" Enter Your Name : ");
	     setName(sc.next());
	     System.out.println(" Enter Your Amount : ");
	     setAmount(sc.nextDouble());
	     
	}
	
	public double getAmount() {
		return Amount;
	   }
	public String getName() {
		return Name;
	   }
   public int getId( ) {
	  return Id;
   }
	
	public void setAmount(double c) {
		Amount=c;
	   }
	public void setName(String b) {
		Name=b;
	   }
   public void setId(int a) {
	   Id=a;
   }
}
 