
public class RaceManager 
{
	void            displayAllRaceDetails   (Race[] raceList)//    Display details (except 
	{
		System.out.println("Race number\tPlayer Name\tNumber of Laps\n");
		for(Race m:raceList)
		{
			System.out.println(String.format("%-10s\t%-10s\t%-20s",m.raceNo.toString(),m.winningPlayer.toString(),m.noOfLaps.toString()));
			
		}
	}
void            displayRacesWithLaps   ( Race[] raceList,  byte laps)
{
	System.out.println("Race number\tPlayer Name\tNumber of Laps\n");
	for(Race m:raceList)
	{
		if(m.noOfLaps==laps)
			System.out.println(String.format("%-10s\t%-10s\t%-20s",m.raceNo.toString(),m.winningPlayer.toString(),m.noOfLaps.toString()));
		
	}
}

void            displayRacesWonBy      ( Race[] raceList, String WonBy)
{
	System.out.println("Race number\tPlayer Name\tNumber of Laps\n");
	for(Race m:raceList)
	{
		if(m.winningPlayer.equals(WonBy))
			System.out.println(String.format("%-10s\t%-10s\t%-20s",m.raceNo.toString(),m.winningPlayer.toString(),m.noOfLaps.toString()));
		
	}
}
void            displayLapsForRace     ( Race[] raceList,byte raceno)
{
	//System.out.println("Race number\tPlayer Name\tNumber of Laps\n");
	for(Race m:raceList)
	{
		
		
	}	 
}
  

}
