package Player_GetterSetter_package;

public class Player 
{
	public Player(String playerName, String playerPosition) {
		super();
		System.out.println("Class name\n==========================\n"+this.getClass()+"\n=====================================");
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		this.getPlayerName();
		this.getPlayerPosition();
	}

	String playerName,playerPosition;

	public void getPlayerName() {
		System.out.println("Player Name: "+playerName);
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void getPlayerPosition() {
		System.out.println("Player Position: "+playerPosition);
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}
	

}
