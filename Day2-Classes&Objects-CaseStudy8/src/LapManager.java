

public class LapManager 
{
	public void displayAllLaps(Lap[] lapList)    
	{
		System.out.println("Lap number\tMaxmimum throws\tPlayer Name\tTiming\n");
		for(Lap m:lapList)
		{
			System.out.println(String.format("%-10s\t%-10s\t%-20s\t%-20s",m.lapNo.toString(),m.throwsMade.toString(),m.fastestPlayer.toString(),m.fastestTime.toString()));
			
		}
	}
	public void  displayFastestInLap(Lap[] lapList,byte lapNo)
	
	{
		float max=1000;
		String fperson="";
		
		for(Lap m:lapList)
		{
		   if((lapNo==m.lapNo)&&(max>m.fastestTime))
		   {
			   max=m.fastestTime;
			   fperson=m.fastestPlayer;
		   }
		  }
		System.out.println("==========================\nFastest Player :"+fperson+"\nFastest time :"+max+"\n==========================\n");
			
		}
		
                                             
    public void displayMaximumThrows(Lap[] laplist)
    {
    	byte max=0;
		//String fperson="";
		
		for(Lap m:laplist)
		{
		   if((max<m.throwsMade))
		   {
			   max=m.throwsMade;
			   //fperson=m.fastestPlayer;
		   }
		  }
		System.out.println("Max throws :"+max);
			
		}	
    }

