package Constructor;

import java.util.Scanner;

public class Laptop {
	
   String Company_name;
   String Operating_system;
   double Price;
   
   
   
   public void ShowLaptopData() {
      
	   System.out.println(" Enter Company Name : "+getCompanyname());

	   System.out.println(" Enter Operating system : "+getOperatingsystem());
	   
	   System.out.println(" Enter Price : "+getPrice());
	   
   }
   
   
  public void acceptLaptopData() {
	 Scanner lac=new Scanner(System.in);
	 
	 System.out.println(" Enter Company Name : ");
	 Company_name=lac.next();
	 
	 System.out.println(" Enter Operating system : ");
	 Operating_system=lac.next();
	 
	 System.out.println(" Enter Price : ");
	 Price=lac.nextDouble();
  }
  
  
   
  // Getter method 
  
   public double getPrice( ) {
	   return Price;
   }     
        
   public String getOperatingsystem ( ) {
	   return Operating_system; 
	}
   
   public String getCompanyname( ) {
  	 return Company_name; 
    }
   
   
   
   
   // Setter method 
    
   public void setPrice(double p) {
	   Price=p;
   } 
 
   public void setOperatingsystem (String o) {
   	Operating_system=o; 
   }
   
    public void setCompanyname(String c) {
    	 Company_name=c; 
   }
  
}
