package String;

public class FinalizePro {
	
	
	public FinalizePro() {
		 System.out.println(" object : "+this);
	}

	public static void main(String[] args) { 
		
		FinalizePro fi=new FinalizePro();
		FinalizePro fin=new FinalizePro();
		System.out.println(" * * * * * * * * * * * * ");
		System.out.println(" A1 : "+fi);
		System.out.println(" A2 : "+fin); 
		fin=null; 
		System.gc();
		System.runFinalization();
		fin=fi;
		System.out.println();
		System.out.println(" A21 : "+fin);
		
	} 
}
