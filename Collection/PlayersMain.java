package Collection;

 
public class PlayersMain {
	public static void main(String[] args) {
		
 // Creating object using parameterized constructor
	Players p1=new Players( "Virat Kohli",
                  13848,
                  4,
                  "India",
                  "Batsman");
	 // Creating another object
    Players p2 = new Players(
            "Jasprit Bumrah",
            500,
            400,
            "India",
            "Bowler"
    );
    
 // Creating object using non-parameterized constructor
    Players p3 = new Players();

    // Accept properties for p3
    p3.AcceptProperties();

    // Show individual player properties
    System.out.println("\nIndividual Player Details:");
    p1.showProperties();
    p2.showProperties();
    p3.showProperties();

    // Show all players from ArrayList
     showPlayers();
	}
	
    // Method to show players from ArrayList
    static void showPlayers() {

        System.out.println("\n===== PLAYERS FROM ARRAYLIST =====");
    
    for (Players p : Players.playerList) {
        System.out.println(p);
    }    
	 
  }
	 
}
