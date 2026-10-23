package Exception;

public class Exception1 {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int a=12, b=0;
		System.out.println("A : "+a);
		System.out.println("B : "+b);   // java.lang.Arithmetic Exception: .
		 
		int c=a/b;
		System.out.println("C : "+c);
	 
		System.out.println("Stop");
	} 
}
