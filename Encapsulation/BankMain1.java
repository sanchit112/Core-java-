package Encapsulation;

public class BankMain1 {
	     public static void main(String[] args) {
		 
	 Bank1 b1=new Bank1();
	 
	 b1.name="sanchit";
	 b1.setBalance(2345) ;
	 
	  System.out.println(" NAME : "+b1.name);
	  System.out.println(" BALANCE : Rs "+b1.getBalance()+"-/");

   }
}