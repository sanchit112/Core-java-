package Exception;

public class Try_Catch {
	
	public Try_Catch() {
		
	}
	public Try_Catch(int a,int b) {
		M1(a,b);
		
	}
	 public void M1( int a, int b) {
			 
			System.out.println("A : "+a);
			System.out.println("B : "+b);
//			int c=a/b;
//			System.out.println("C : "+c);
			
			try {  
				int c=a/b;
			System.out.println("C : "+c); 
			
			}catch(ArithmeticException d) {
				System.out.println("can not divided by Zero "+d);
			}
	 } 
	 
	 public static void main(String[] args) { 
		 Try_Catch s=new Try_Catch(12,0); 
		 
	}
	 
}
