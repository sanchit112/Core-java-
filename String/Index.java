package String;

public class Index {
	
	public static void main(String[] args) { 
		
	String s1="Java Is A Programming Language"; 
	// starting  char
	int index=s1.indexOf('a'); 
	System.out.println(index); 
	// start from after 5 char
	index=s1.indexOf('a',5); 
	System.out.println(index); 
	
	index=s1.indexOf('e'); 
	System.out.println(index);
    // String 
	index=s1.indexOf("gram"); 
	System.out.println(index); 
	System.out.println(); 	
	
	//last 
	index=s1.lastIndexOf('a'); 
	System.out.println(index);
	index=s1.lastIndexOf('b');// Tya madhe b nhi ahe mhnun -1 Value print zali ahe
	System.out.println(index);
	
	
  }
}
