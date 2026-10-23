//- create a class Players
//- define a properties of Players
//- name, runs, wickets, team, player_type
//- define non-parameterized constructor
//- define parameterized constructor
//- used encapsulation
//- define a method to accept properties
//- define a method to show properties
 
// - create a class MainPlayers 
//- define a main() method
//- create object of Players class and call the properties
//- create array list of player and store player into array list
//- note when you create object of player it will insert immediately into array list
//- write a method to to show player frim list and also override toString() method

package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Players {

    private  String name;
    private  int runs;
    private  int wickets;
    private  String team;
    private  String  player_type;
      
      // ArrayList to store players
      static ArrayList<Players> playerList = new ArrayList<>();

        // Non Parameterized constructor
	  public Players() {
		  name = "Unknown";
	        runs = 0;
	        wickets = 0;
	        team = "Unknown";
	        player_type = "Unknown";

	        // Automatically insert object into ArrayList
	        playerList.add(this);
	}
	  // Parameterized constructor
	  public Players(String name, int runs, int wickets, String team, String player_type) {
		 
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.team = team;
		this.player_type = player_type;
		
		  // Automatically insert object into ArrayList
        playerList.add(this);
	}
	  
	  @Override
	public String toString() {
		return "Players [name=" + name + 
				", runs=" + runs + 
				", wickets=" + wickets + 
				", team=" + team + 
				", player_type="
				+ player_type + "]";
	}
	  public void showProperties() {
		  
	     System.out.println(" Name :- "+getName()); 
    	     System.out.println(" Runs :- "+getRuns()); 
    	     System.out.println(" Wickets :- "+getWickets()); 
    	     System.out.println(" Team :- "+getTeam()); 
    	     System.out.println(" Player Type :- "+getPlayer_type());
	  } 
      
      public void AcceptProperties() {
    	  Scanner sc=new Scanner(System.in);
    	  
    	  System.out.println("Enter your Name :-");
    	  setName(sc.next());
    	  System.out.println("Enter your Runs :-");
    	  setRuns(sc.nextInt());
    	  System.out.println("Enter your Wickets :-");
    	  setWickets(sc.nextInt());
    	  System.out.println("Enter Team :-");
    	  setTeam(sc.next());
    	  System.out.println("Enter your Player Type :-");
    	  setPlayer_type(sc.next());
      }
      
      public String getName() {
  		return name;
  	}
	  public void setName(String name) {
		  this.name = name;
	  }
	  public int getRuns() {
		  return runs;
	  }
	  public void setRuns(int runs) {
		  this.runs = runs;
	  }
	  public int getWickets() {
		  return wickets;
	  }
	  public void setWickets(int wickets) {
		  this.wickets = wickets;
	  }
	  public String getTeam() {
		  return team;
	  }
	  public void setTeam(String team) {
		  this.team = team;
	  }
	  public String getPlayer_type() {
		  return player_type;
	  }
	  public void setPlayer_type(String player_type) {
		  this.player_type = player_type;
	  } 
	 
}
