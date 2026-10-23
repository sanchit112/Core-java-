package Pattern;

 import java.util.Scanner;

   public class Remainder_1 {

	public static void main(String[] args) {
      
	
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Number ");
		
		  int n=sc.nextInt();
		  System.out.println(" Number : "+n);
		  
		  int r=n%5;
		  System.out.println(" Remainder : "+r);
		  
		  int t=n-r;
		  System.out.println(" T  : "+t);
   
	}
 }
