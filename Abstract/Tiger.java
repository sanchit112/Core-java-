package Abstract;

 public class   Tiger extends Animal    {
	  
	     @Override
	    public void Sound() {
	        System.out.println("The tiger growls: Grrr!");
	    }
	     void MySound(String s) {  
		     
	          System.out.println("koooo");
	 }
	     
	     public static void main(String[] args) {
	    	 Animal a=new Tiger();
	    	 
	    	 a.Sound();
	    	 a.MySound("san");
		}
  }
