package Inheritance;

import java.util.Scanner;

public class Iron_3 extends  Metal_3 {
       
	
	String Geo_location; 
	
	public   Iron_3 () {
		 
		  AcceptIron();
		  ShowIron();
		
	  }

	  public  Iron_3 (String s ) {
		  setGeo_location(s);
		  
		   
	  }
	  public void ShowIron() {
		  ShowMetal();
		 
		  System.out.println(" GEO_LOCATION : "+getGeo_location());
		  
	  }
	  
	  public void AcceptIron() { 
		  AcceptMetal();
		  
		  Scanner sp=new Scanner(System.in);
		  
		  System.out.println(" Enter your GEO_LOCATION  : ");
		   setGeo_location(sp.next());
		  
	  } 
	   
	  
	  
	  public  String getGeo_location( ) {
		return Geo_location ; 
	  } 
	  
	  public void setGeo_location(String s) {
		  Geo_location=s; 
	  }
	  
	
}

 
