package Exception;

import java.util.Scanner;

public class BANK {
	
	private String AccountHolder;
	private int AccountNumber;
	private int Pin; 
	private double Balance;
	   
	 public BANK() {
		 super();
		} 
	   
	 public BANK(int accountNumber, int pin, String accountHolder, double balance) {
		super();
		 this.setAccountHolder(accountHolder);
		 this.setAccountNumber(accountNumber);
		 this.setPin(pin);
		 this.setBalance(balance);
	}
	 
	 public void Showdata() { 
		 
		 System.out.println(" Account Holder Name : "+this.getAccountHolder()); 
		 System.out.println(" Account Number : "+this.getAccountNumber());
		 System.out.println(" Pin : "+this.getPin());
		 System.out.println(" Balance : "+this.getBalance());
		 
	 } 
	 
	 public void Acceptdata() { 
		 Scanner Sc=new Scanner(System.in);
		 
		 System.out.println(" Enter your Account Holder Name : ");
		 this.setAccountHolder(Sc.next());
		 
		 System.out.println(" Enter your Account Number : ");
		 this.setAccountNumber(Sc.nextInt());
		 
		 System.out.println(" Enter your Pin : ");
		 this.setPin(Sc.nextInt());
		 
		 System.out.println(" Enter your Balance : ");
		 this.setBalance(Sc.nextDouble());
		 
	 } 
	
	 public void WithDrawAmount( int pin ,double amount) {
		 
		 if(this.getPin()==pin) {
			  try {
				  if(this.getBalance()<amount) {
					 throw  new InsufficientBalanceException  ("Insufficient Balance Exeption");
				  }
				  else {
					  setBalance(this.getBalance()-amount); 
					  this.showBalance();
				  }
			  }catch(InsufficientBalanceException e) {
				  e.showError();
			  }
		 }else {
			 System.out.println(" please Enter your correct Pin : ");
		 }
		 
	 }                      
	 
	 public void showBalance() {
		 System.out.println(" Current Balance : Rs. "+this.getBalance());
	 }
	 
	  
	 public int getAccountNumber() {
		 return AccountNumber;
	 }
	 public void setAccountNumber(int accountNumber) {
		 AccountNumber = accountNumber;
	 }
	 public int getPin() {
		 return Pin;
	 }
	 public void setPin(int pin) {
		 Pin = pin;
	 }
	 public String getAccountHolder() {
		 return AccountHolder;
	 }
	 public void setAccountHolder(String accountHolder) {
		 AccountHolder = accountHolder;
	 }
	 public double getBalance() {
		 return Balance;
	 }
	 public void setBalance(double balance) {
		 Balance = balance;
	 }
	  
}
