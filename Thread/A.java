package Thread;

public class A extends Thread{

	@Override
	public void run() {
		System.out.println("Thread is running"); 
	} 
	@Override
	public void start() {
		System.out.println("Thread is running 222"); 
	}
	
	public static void main(String[] args) {
		A s=new A();
		System.out.println("Main thread ");
		//System.out.println("**///////////////////////////**");
		s.run();
		//System.out.println("*********");
		s.start();
		  
	} 
}
