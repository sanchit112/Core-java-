package Constructor;

public class Cat {
		
	private String Name;
	private int Age;
	
	
	public Cat() {
		setName("kittu");
		setAge(1);
	}
	
	
	 public void showCatData() {
		 
		 System.out.println("Name "+getName());
		 System.out.println("Age "+getAge());
	 }
	
	 
	 public void setAge(int a) {   
		 Age=a;	 	 
	 }
	 public int getAge() {	
		 return Age;	 
	 } 
	
	public void setName(String n) {
		Name=n;
	}
	 public String getName() {		
		 return Name; 
	 } 
	 
}
