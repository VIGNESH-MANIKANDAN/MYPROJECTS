

public class Lap 
{
	public Lap(Byte lapNo, Byte throwsMade, String fastestPlayer, Float fastestTime) {
		super();
		this.lapNo = lapNo;
		this.throwsMade = throwsMade;
		this.fastestPlayer = fastestPlayer;
		this.fastestTime = fastestTime;
	}
	Byte            lapNo;                  
	Byte            throwsMade;            // getThrowsMade          setThrowsMade
	String          fastestPlayer;         // getFastestPlayer       setFastestPlayer
	Float           fastestTime;           // getFastestTime         setFastestTime
	public Byte getLapNo() {
		return lapNo;
	}
	public void setLapNo(Byte lapNo) {
		this.lapNo = lapNo;
	}
	public Byte getThrowsMade() {
		return throwsMade;
	}
	public void setThrowsMade(Byte throwsMade) {
		this.throwsMade = throwsMade;
	}
	public String getFastestPlayer() {
		return fastestPlayer;
	}
	public void setFastestPlayer(String fastestPlayer) {
		this.fastestPlayer = fastestPlayer;
	}
	public Float getFastestTime() {
		return fastestTime;
	}
	public void setFastestTime(Float fastestTime) {
		this.fastestTime = fastestTime;
	}

}
