package Abstract;

public class B  implements A {
	public B() {
		
		s1("sanchit");
		 
		s3(28000);
	}
	
	@Override
	public void s1(String s) { 
		 System.out.println("Name : "+s);
	}
	@Override
	public void s3(double sa) {
		 System.out.println("Saalary : "+sa);
		
	}
     public static void main(String[] args) {
	 B sc=new B();
	 
	   
}
	
}
