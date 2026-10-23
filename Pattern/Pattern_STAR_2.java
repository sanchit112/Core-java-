package Pattern;

public class Pattern_STAR_2 {
    
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) { // row
			
			for(int b=1; b<=5; b++) { // column
				
				if(b==3)
				
				System.out.print(" $ ");
			   
				else
					System.out.print(" * ");
								
			}		
			
			System.out.println();
		}
	}
}
