
public class Player {
	private String playerName;
	private String playerGame;
	public Player() {
		//this("Virat");
		playerGame="Cricket";
		
	}
public Player(String playerName) {
		this();
		this.playerName=playerName;
	}
public String toString() {
	return "Player : "+playerName+"  "+playerGame;
	}

public static void main(String[]ishwar) {
	Player p = new Player();
	System.out.println(p);
	Player p1 = new Player("Hardik");
	System.out.println(p1);
	
}
}
