package String;

public class Aa {
	
	
	public Aa() {
       System.out.println("Say Hello "+this);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Dstroy object "+this);
	}
	public static void main(String[] args) {
		Aa a=new Aa();
		System.out.println("A -: "+a); 
		System.out.println();
		Aa a1=new Aa();
		 a1=null;
		System.gc();
		System.runFinalization();
		a1=a;
		System.out.println("A1 -: "+a1); 
		System.out.println();
		
		
		
	}

}
