package Pattern;

 public class Pattern_STAR_PLUS {
   
	 public static void main(String[] args) {
	 
		  for( int r=1; r<=5; r++) {
			  
			  for(int c=1; c<=5; c++) {
				  
				  if(c==3)
					  System.out.print(" $ ");
				  else if(r==3)
				      System.out.print(" $ ");
				  else
					  System.out.print(" * ");
				  
			  }
			  
			  System.out.println();
			  
		  } 
	 } 
}
