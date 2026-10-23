package Polymorphism;

public class A {
	 A(String s) { System.out.print("String"); }
	    A(Object o) { System.out.print("Object"); }

	public static void main(String[] args) {
		new A("Java");
		 
	}
}
