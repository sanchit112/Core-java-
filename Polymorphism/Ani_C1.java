package Polymorphism;

public class Ani_C1 {

	 
	
	
	public void s1() {
		System.out.println("K");
	}
    public void s1(int a) {
    	System.out.println("L");
	}
   public void s1(String s) {
	   System.out.println("M");
    }
   
   public static void main(String[] args) {
	   Ani_C1  s=new Ani_C1();
	   s.s1();
	   s.s1(21);
	   s.s1("sanchit");
  
    }
	 
}
