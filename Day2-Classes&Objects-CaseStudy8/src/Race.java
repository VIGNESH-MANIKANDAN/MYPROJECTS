import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Race 
{
	public Race(Byte rnum,Byte noOfLaps,String wplayer) throws NumberFormatException, IOException {
		super();
		this.raceNo=rnum;
		this.winningPlayer = wplayer;
		this.noOfLaps = noOfLaps;
		LapManager manager=new LapManager();
		int n,i1;
		byte lnum,thr;
		String pname;
		float time;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		Scanner ss=new Scanner(System.in);
		
		Lap objects[]=new Lap[this.noOfLaps];
		for(int i=0;i<this.noOfLaps;i++)
		{
			
			
				System.out.println("Enter Lap Number");
				lnum=Byte.parseByte(br.readLine());
				System.out.println("Enter Maximum throws");
				thr=Byte.parseByte(br.readLine());
				System.out.println("Enter Player name");
				pname=br.readLine();
				System.out.println("Enter  Best time");
				time=Float.parseFloat(br.readLine());
				objects[i]=new Lap(lnum,thr,pname,time);
				
			}
		//	manager.displayAllLaps(objects);
			//manager.displayFastestInLap(objects,(byte)103);
		//	manager.displayMaximumThrows(objects);
					
			

			
		
		
	}
	Byte            raceNo;//               getRaceNo            setRaceNo
	Byte            noOfLaps;//             getNoOfLaps          setNoOfLaps
	String          winningPlayer;//        getWinningPlayer     setWinningPlayer
	LapManager      lapManager ;//          getAllLapDetails     setAllLapDetails
	public Byte getRaceNo() {
		return raceNo;
	}
	public void setRaceNo(Byte raceNo) {
		this.raceNo = raceNo;
	}
	public Byte getNoOfLaps() {
		return noOfLaps;
	}
	public void setNoOfLaps(Byte noOfLaps) {
		this.noOfLaps = noOfLaps;
	}
	public String getWinningPlayer() {
		return winningPlayer;
	}
	public void setWinningPlayer(String winningPlayer) {
		this.winningPlayer = winningPlayer;
	}
	public LapManager getLapManager() {
		return lapManager;
	}
	public void setLapManager(LapManager lapManager) {
		this.lapManager = lapManager;
	}


}
