package Method;

public class Operation_1 {
	
//	ACCESS_MODIFIER , RETURN_TYPE ,METHOD_NAME (PARAMETER_LIST){
	
// }
	
	// DECLARATON AND DEFINITION OF METHOD 
	//1. INSTANCE METHOD 
	 public void total(int a ,int b) {
		 
      int c=a+b;
   
      System.out.println(" ADD : "+c );
	 }
	 
      public void  subtraction(int a, int b) {
    	  
    	  int d=a-b;
    	  System.out.println(" SUB : "+d);
      }
      
      public void  multi(int a, int b) {
    	  
    	  int d=a*b;
    	  System.out.println(" MUL : "+d);
      }
   
     public void  div(int a, int b) {
 	  
 	  int d=a/b;
 	  System.out.println(" DIV : "+d);
   }
    
      public void mod( int a , int b) {
    	  int d=a%b;
    	  System.out.println(" MOD : "+d);
    	  
    }
      
      // 2.STATIC METHOD
      
      public static void cube(int a) {
    	  int d=a*a*a;
    	  System.out.println(" cube :"+d);
    	  
      }
      
}
