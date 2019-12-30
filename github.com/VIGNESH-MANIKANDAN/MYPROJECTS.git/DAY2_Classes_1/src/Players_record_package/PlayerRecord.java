package Players_record_package;

public class PlayerRecord {
	public PlayerRecord(int i, int j, int k, float avgLapSpeed, float maxLapSpeed,
			float avgThrowDistance, float maxThrowDistance) {
		super();
		this.matchesPlayed = (byte) i;
		this.numOfWins = (byte) j;
		this.numOfLosses = (byte) k;
		this.avgLapSpeed = avgLapSpeed;
		this.maxLapSpeed = maxLapSpeed;
		this.avgThrowDistance = avgThrowDistance;
		this.maxThrowDistance = maxThrowDistance;
	}
	byte matchesPlayed,numOfWins,numOfLosses;
	float avgLapSpeed,maxLapSpeed,avgThrowDistance,maxThrowDistance;
	
	public  void displayPlayerRecord()
	{
		System.out.println("Number of matches played:"+matchesPlayed);
		System.out.println("Number of wins:"+numOfWins);
		System.out.println("Number of losses:"+numOfLosses);
		System.out.println("Average Lap speed:"+this.avgLapSpeed);
		System.out.println("Maximum Lap speed:"+this.maxLapSpeed);
		System.out.println("Average Throw Distance:"+this.avgThrowDistance);
		System.out.println("Maximum Throw Distance:"+this.maxThrowDistance);
	}
	
	
	

}
