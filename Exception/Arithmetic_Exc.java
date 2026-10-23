//• Take two integers from the user and divide the first number by the second.
//• Handle ArithmeticException when the second number is zero.
 
package Exception;

import java.util.Scanner;

public class Arithmetic_Exc {
	
	public static void main(String[] args) {
		
	try { 
		System.out.println("Sa");
	int a=10,b=0;
    int c=a/b; 
        
       
	}catch(ArithmeticException e) {
		System.out.println(e);  
		System.out.println("pat");
	}  
		
	}

}
