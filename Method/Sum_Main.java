package Method;

import java.util.Scanner;

   public class Sum_Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter Number");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		Sum a1=new Sum();
		a1.total(a, b);
		System.out.println();
//    	int	d=a1.multi(a , b);
//		System.out.println(d);
		 
	}
}
