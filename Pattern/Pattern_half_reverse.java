package Pattern;

  public class Pattern_half_reverse {
    
	   public static void main(String[] args) {
		
	   int bs=5;
		   
		   for(int r=1; r<=5; r++) {
			   
			   for(int c=1; c<=(bs-r); c++) 
				   System.out.print("  ");
				   
				   for(int k=1; k<=r; k++) {	
					   
					   System.out.print(" * " +" ");		//   " * " of the both side space 			   
			   }
				   System.out.println();
		   }				 
			   
	}
}
