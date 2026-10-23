package Constructor;

public class Book {
	
	String Title ,Author ;
	double Price;
	
	
	public Book() {
		getPrice();
	}
	
	public Book(String T, String A) {
		getTittle();
		getAuthor();
	}
	
	
	
	
	
	
	
	
	
	public void setTittle(String T ,String A) {
		Title=T;
		Author=A;	
	}
    
	 public void setPrice(double b) {
		 Price=b;
	 }
	  
	 public String getTittle() {
		 
	    return Title;
		}

	 public String getAuthor() {
		 
		    return Author;
			}
	 
	 public double getPrice() {
		return Price;
	 }
	 
	 

}
