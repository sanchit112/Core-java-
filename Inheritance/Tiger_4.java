package Inheritance;

import java.util.Scanner;

public class Tiger_4  extends Animal_4 {
	      
	String Tiger_Type; 
	 
	Tiger_4(){
		 
		  AcceptDataTiger(); 
		  ShowDataTiger();
		  
	} 
     Tiger_4(String s){
		setTiger_Type(s);
	 }
     
     public void ShowDataTiger() {
    	 ShowDataAnimal();
    	 System.out.println(" Enter you TIGER TYPE : "+getTiger_Type());
     }
     public void AcceptDataTiger() {
    	 AcceptDataAnimal();
    	 Scanner sc=new Scanner(System.in);
    	 
    	 System.out.println(" Enter you TIGER TYPE : ");
    	 setTiger_Type(sc.next());
     }
	
	public String getTiger_Type() {
		return Tiger_Type;
	 }
    public void setTiger_Type(String t) {
	   Tiger_Type=t;
     }
}
