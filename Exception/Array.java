package Exception;

public class Array {
	 
	 public static void main(String[] args) {
		
		 int[] number = {10,12,34,35,90,60} ;  
		 
		 
	try {
		 System.out.println(number[8]);
		
	}catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(e.getMessage());
	}
	 System.out.println("sanchit");
	 
	 
	  
      } 
   } 