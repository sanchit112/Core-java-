package Abstract;
 
public class Lion extends Animal{
	     
	  
	
	
	
	  @Override
         void Sound() {  
     
              System.out.println("AAAoooo");
     }
	  void MySound(String s) {  
		     
          System.out.println("Booo");
 }
	  
	  public static void main(String[] args) {
	    	 Animal a=new  Lion();
	    	 
	    	 a.Sound();
	    	 a.MySound("san");
		}
}
