package Encapsulation;

public class BankMain {

	public static void main(String[] args) {
   
		Bank bank=new Bank();
		
		bank.Name="sanchit";
    //	bank.Balance=30000;
		bank.setBalance(30000);
				
		System.out.println(" NAME -: "+bank.Name);
		System.out.println(" BALANCE -: "+bank.getBalance()+"-/");
//		System.out.println(" BALANCE -: Rs "+bank.Balance/2+"-/");
  
	}
}
