package Polymorphism;

public class This_KEYWORD_1 {
	
	This_KEYWORD_1 (){ 
		
		 this(2); 
		System.out.println(" Keyword ");
	}
    This_KEYWORD_1 (int n){
    	this("j");
		System.out.println(" Integer ");
	}
    This_KEYWORD_1 (String s){
	
    	System.out.println(" String ");
   	}
    
    
   public static void main(String[] args) {
	   
	   This_KEYWORD_1 sc=new This_KEYWORD_1 (); 
	   
  }  
	  
}
