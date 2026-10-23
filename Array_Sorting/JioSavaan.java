//---create a class Jiosaavn 
//	- define a properties of Jiosaavn 
//	- properties -> id,name,subscription_amount,language
//	- ussed encapsulation 
//	- define a non-parameterized constructor 
//	- define a parameterized constructor 
//	- define a method to accept properties 
//	- define a method to show properties 
//	- define array of Jiosaavn 
//	- define a method to accept and show properties of array 
//	- define a a method to sort customer by subscription_amount from higher to lower 
//	- define a a method to sort customer by subscription_amount from lower to  higher
//
//--- create a class JiosaavnMain 
//	- define a main() method 
//	- call array method 

package Array_Sorting;

import java.util.Scanner;

public class JioSavaan {
    
	 int Id;
     String	 Name;
     double Amount;
     
     private static JioSavaan jio[]=new JioSavaan[2];
     
     public JioSavaan() {
    	 setid(0);
    	 setname("s");
    	 setamount(0);
     } 
     public JioSavaan(int i, String s, double d) {
    	 setid(i);
    	 setname(s);
    	 setamount(d);
     }
     
     public void sortJioArray() {
    	 for(int p=0;p<jio.length;p++) {
    		 for(int j=p+1;j<jio.length;j++) {
    			 if(jio[p].getaamount()>jio[j].getaamount()) {
    			 JioSavaan k=jio[p];
    			   jio[p]=jio[j];
    			   jio[j]=k;
    			 }
    		 }
    	 }
     }
     
     public void ShowJioArray() { 
    	 for( JioSavaan a1  : jio ) {
    		 a1.ShowJioData();
    	 }
     } 
     
     public void AcceptJioArray() {
    	 for(int i=0; i<jio.length;i++) {
    		 jio[i]=new JioSavaan();
    		 jio[i].AcceptJioData();
    	 }
     }
     
     public void ShowJioData() {
    	 System.out.println(" ENTER YOUR ID : "+getid());
    	 System.out.println(" ENTER YOUR NAME : "+getname());
    	 System.out.println(" ENTER YOUR AMOUNT : "+getaamount());
     }
     public void AcceptJioData() {
    	 Scanner sc=new Scanner(System.in);
    	 
    	 System.out.println(" ENTER YOUR ID : ");
    	 setid(sc.nextInt());
    	 System.out.println(" ENTER YOUR NAME : ");
    	 setname(sc.next());
    	 System.out.println(" ENTER YOUR AMOUNT : ");
    	 setamount(sc.nextDouble());
    	 
     }
     
     
     public double getaamount() {
    	 return Amount;
     }
     public String getname() {
    	 return Name;
     }
     public int getid() {
    	 return Id;
     }
     
     
     public void setamount(double a) {
    	 Amount=a;
     }
     public void setname(String n) {
    	 Name=n;
     } 
	public void setid(int i) {
		Id=i;
	}
}
