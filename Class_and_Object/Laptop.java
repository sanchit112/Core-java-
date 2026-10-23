package Class_and_Object; 

import java.util.Scanner;

public class Laptop {
         int Laptop_id;
         String Laptop_name ; 
         double Laptop_price;
   
          public void ShowLaptopData() {
        	  System.out.println(" Enter Laptop ID : "+Laptop_id);
        	  System.out.println(" Enter Laptop NAME : "+Laptop_name);
        	  System.out.println(" Enter Laptop PRICE : Rs "+Laptop_price+"-/");
          }
          
         public void LaptopData() {
        	 
        	 Scanner scanner=new Scanner(System.in);
        	 
        	 System.out.println(" Enter Laptop ID");
        	 Laptop_id=scanner.nextInt();
        	 
        	 System.out.println(" Enter Laptop NAME ");
        	 Laptop_name=scanner.next();
        	 
        	 System.out.println(" Enter Laptop PRICE ");
        	 Laptop_price=scanner.nextDouble();        	 
        	 
        	 
         }
         
         
         
}


