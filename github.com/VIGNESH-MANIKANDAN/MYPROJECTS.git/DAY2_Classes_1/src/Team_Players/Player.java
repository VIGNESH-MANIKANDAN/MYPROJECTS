package Team_Players;

public class Player 
{
	public Player(String playerName, String playerPosition) {
		super();
		this.playerName = playerName;
		this.playerPosition = playerPosition;
	}
	String playerName;
	String playerPosition;
	public void whoAmI()
	{
		System.out.println("I am "+this.playerName);
		System.out.println("I am a "+this.playerPosition);
	}

}
