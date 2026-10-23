package Pattern;

  public class Pattern_Border {

	 public static void main(String[] args) {
      
		 for(int r=1; r<=5; r++) {
			 
			 for(int c=1; c<=5; c++) {
				 
				 if(r==1 || r==5 ||  c==1 || c==5)
					 System.out.print(" $ ");
				 else
					 System.out.print(" * "); //star remove or space between 
		 	 }
			 
			 System.out.println();	  
 	   }			 			 
	}
}
