package Array;

import java.util.Scanner;

public class Netflix {

	
	 String Name;
	 String Playlist;
	 double Price; 
	 
	 
	 
	 public Netflix() {
		 SetName("san");
		 SetPlaylist("M");
		 setPrice(12); 
	 }
	 
	 public Netflix(String n , String p , double q) {
		 SetName(n);
		 SetPlaylist(p);
		 setPrice(q);
	 }
	 
	 
	 public void ShowData() {
		 
		 System.out.println(" Name : "+getName());
		 System.out.println(" Playlist : "+getPlaylist());
		 System.out.println(" Price : "+getPrice());
	 }
	
	 
	 public void Acceptdata() {
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println(" Enter Your Name");
		 SetName(scanner.next());
		 
		 System.out.println(" Enter your Playlist ");
		 SetPlaylist(scanner.next());
		 
		 System.out.println(" Enter your Price ");
		 setPrice(scanner.nextDouble());
		 
	 }
	 
	
	 //Getter method
	 
	 public double getPrice() {
		 return Price;
	 }
	 
	 public String getPlaylist() {
		 return Playlist;
	 }
	 
	 public String getName() {
		 return Name;
	 }
	   
	// Setter method
	
	 public void setPrice(double q) {
		 Price=q;
	 }
	 
	 public void SetPlaylist(String p) {
		 Playlist=p;
	 }
	 
	public void SetName( String n) {
		Name=n;
	}
	
	
}
