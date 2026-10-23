package Array;

import java.util.Scanner;

public class SquareCube {
    
	public static void main(String[] args) {
	 
		int a[]=new int[5];
		
		SquareCube cu=new SquareCube();
		 cu.AcceptValue(a);
		 cu.ShowValue(a);
		 cu.ShowSquare(a);
		 cu.ShowCube(a);
		 
	}
	
	public void ShowCube(int y[]) {
		System.out.println(" ");
		int h=0;
		while(h<y.length) {
			int as=y[h]*y[h]*y[h];
			System.out.println(" Cube : "+as);
			h++;
		}
			
	}
	
	
	public void ShowSquare(int y[]){
		System.out.println(" ");
		int k=0;
		while(k<y.length){
			int sq=y[k]*y[k];
			 System.out.println(" Square : "+sq);
			k++;
		}
	}
	
	public void ShowValue(int y[]) {
		System.out.println(" ");
		for(int b=0; b<y.length; b++) {
               System.out.println(" value : "+y[b]);		
		}
	}
	
	
	public void AcceptValue(int y[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Value : ");
		
		 for(int k=0; k<y.length; k++) {
			 y[k]=sc.nextInt();
		 }
		
	}
	 
}