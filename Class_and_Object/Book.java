package Class_and_Object;

import java.util.Scanner;

public class Book {

	int book_id;
	String book_name, book_author;
	double book_price;
	
	
	public void Showbook(){
	 System.out.println(" Book Id : " +book_id);
	 System.out.println(" Book Name : "+book_name);
	 System.out.println(" Book Author : "+book_author);
	 System.out.println(" book price : Rs "+book_price+" /-");
	}
	
	public void Acceptdata() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println(" Enter book Id ");
	    book_id=scanner.nextInt();
		
		System.out.println(" Enter book name ");
	    book_name=scanner.next();
	    
	    
	    System.out.println(" Enter book Author ");
	    book_author=scanner.next();
	    
	    System.out.println(" Enter book Price ");
	    book_price=scanner.nextDouble();
		
	}
}
