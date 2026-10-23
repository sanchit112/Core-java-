package String;

public class A {
 
	public static void main(String[] args) {
		
		String S1="Apple";
		String S2="Apple";
		//compare Reference
		System.out.println(S1==S2);
		//compare content
		System.out.println(S1.equals(S2));
		System.out.println(); 
		String t1=new String("Water");
		String t2=new String("Water"); 
		System.out.println(t1==t2);
		 System.out.println(t1.equals(t2));
		
		
	}
	 
}
