package Method;

import java.util.Scanner;

public class Spotify {
	
	int Total_music;
	String Music_name, Music_Playlist ,Music_artist;
	double Music_Buy;
	
	
	public void ShowAcceptData() {
		System.out.println(" Enter Music NAME : "+Music_name);
		System.out.println(" Enter Music PLAYLIST : "+Music_Playlist);
		System.out.println(" Enter Music ARTIST : "+Music_artist);
		System.out.println(" Enter Music BUY : "+Music_Buy);
		System.out.println(" Enter Music TOTAL : "+Total_music);
	}
	
	public void AcceptData() {
		Scanner s1=new Scanner(System.in);
		
		System.out.println(" Enter Music NAME");
		Music_name=s1.next();
		
		System.out.println(" Enter Music Playlist");
		Music_Playlist=s1.next();
		
		System.out.println(" Enter Music Artist");
		Music_artist=s1.next();
	
		System.out.println(" Enter Music BUY ");
		Music_Buy=s1.nextDouble();
	   
		System.out.println(" Enter Total Music ");
		Total_music=s1.nextInt();
		
	}
 
}
