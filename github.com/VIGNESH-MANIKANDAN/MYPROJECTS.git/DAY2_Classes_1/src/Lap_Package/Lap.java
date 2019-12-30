package Lap_Package;

public class Lap 
{
	public Lap(int lapNo, int throwsMade, String fastestPlayer, float fastestTime) {
		super();
		this.setLapNo((byte)lapNo);
		this.setFastestPlayer(fastestPlayer);
		this.setThrowsMade((byte)throwsMade);
		this.setFastestTime(fastestTime);
	}
	byte lapNo,throwsMade;
	String fastestPlayer;
	float fastestTime;
	public byte getLapNo() {
		return lapNo;
	}
	public void setLapNo(byte lapNo) {
		this.lapNo = lapNo;
	}
	public byte getThrowsMade() {
		return throwsMade;
	}
	public void setThrowsMade(byte throwsMade) {
		this.throwsMade = throwsMade;
	}
	public String getFastestPlayer() {
		return fastestPlayer;
	}
	public void setFastestPlayer(String fastestPlayer) {
		this.fastestPlayer = fastestPlayer;
	}
	public float getFastestTime() {
		return fastestTime;
	}
	public void setFastestTime(float fastestTime) {
		this.fastestTime = fastestTime;
	}
	
public void display()
{
	System.out.println("Lap Number: "+this.getLapNo());
	System.out.println("Fastest Player: "+this.getFastestPlayer());
	System.out.println("Fastest Time: "+this.getFastestTime());
	System.out.println("Throws Made: "+this.getThrowsMade());
}
}

