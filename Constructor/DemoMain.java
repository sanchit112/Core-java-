package Constructor;

public class DemoMain {
    
	public static void main(String[] args) {
     //	Demo d1=new Demo();
		
		Demo d2=Demo.getDemoClassObject();
		System.out.println(d2);
		Demo d3=Demo.getDemoClassObject();
		System.out.println(d2);
		
//		Demo d4=Demo.getDClassObject();
//		System.out.println(d4);
//		d4=null;
//		System.out.println(d4);
//		Demo d5=Demo.getDClassObject();
//		System.out.println(d5);
		
	}
}
