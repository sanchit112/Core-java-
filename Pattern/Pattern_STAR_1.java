package Pattern;

public class Pattern_STAR_1 {

	 public static void main(String[] args) {
		
		 for(int a=1; a<=5; a++) {
			 
			 for(int b=1; b<=5; b++) {
				 if(a==3)
				 System.out.print(" $ ");
				 else
					 System.out.print(" * ");
			 }
			 
			 System.out.println();
		 }
	}
}
 