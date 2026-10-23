package Array;

import java.util.Scanner;

public class Operator {	  
	
     public static void main(String[] args) {
	 	
	int a[]=new int[5];
	
	Operator b1=new Operator();
	b1.AcceptValue(a);
	b1.ShowValue(a);
	b1.ShowEvenValue(a);
    b1.ShowOddValue(a);
    b1.ShowSquare(a);
     
	
     
     }
     
     public void ShowSquare(int y[]){
    	 System.out.println(" ");
    	 System.out.println(" ");
    		int k=0;
    		while(k<y.length){
    			int sq=y[k]*y[k];
    			System.out.println("  Square : "+sq);
    			k++;
    		}
    	}
     
     public void ShowOddValue(int l[] ) {
    	 System.out.println("");
    	 System.out.print(" Odd Value :  ");
    	 for(int k=0; k<l.length; k++) { 
    		 if(l[k]%2!=0)
    		 System.out.print(l[k]+" ");
    	 }
     }
     public void ShowEvenValue(int h[] ) {
    	 System.out.println("");
    	 System.out.print( " Even Value : ");
    	 for(int k=0; k<h.length; k++) {
    		 if(h[k]%2==0)
    		 System.out.print(h[k]+" ");
    	 }
     }
     
     public void ShowValue(int h[] ) {
    	 System.out.print(" Array Value : ");
    	 for(int k=0; k<h.length; k++) {
    		 System.out.print(h[k]+" ");
    	 }
     }
	   
     
     public void AcceptValue(int y[] ) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Array in Value "); 
		int k=0;
		while(k<y.length) {
		      y[k]=scanner.nextInt();
			k++;
		}
		 
	}
	 
}     