package Exception;
 
public class Nullpointer {
	
	private String Name;
	

	public Nullpointer() {
		
		 System.out.println("Sanchit "+this);
		 
	} 
	
	@Override
	public String toString() {
		return "Nullpointer [Name=" + Name + "]";
	}
	public String getName() {
		return Name;
	} 
	public void setName(String name) {
		Name = name;
	} 
	public static void main(String[] args) {
		Nullpointer sa=new Nullpointer();
	}
	
} 