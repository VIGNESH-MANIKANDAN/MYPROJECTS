import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int nraces;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number off races: ");
		nraces=s.nextInt();
		Race r[]=new Race[nraces];
		for(int i=0;i<nraces;i++)
		{
			System.out.println("Enter the details of race"+(i+1));
			int raceno=s.nextInt();
			String sname=s.next();
			r[i]=new Race((byte)(i+1),(byte)raceno,sname);
			
		}
		System.out.println("RACE MANAGER");
		System.out.println("1. Display all races\r\n" + 
				"\r\n" + 
				"2. Display races with lap count\r\n" + 
				"\r\n" + 
				"3. Display races won by (player)\r\n" + 
				"\r\n" + 
				"4. Display lap details for race no\r\n" + 
				"\r\n" + 
				"5. Exit");
		int ch;
		System.out.println("Enter choice");
		ch=s.nextInt();
		RaceManager rm=new RaceManager();
		switch(ch)
		{
		case 1:
			

			rm.displayAllRaceDetails(r);
			break;
		case 2:
			System.out.println("Enter the lapnumber");
			byte data=s.nextByte();

			rm.displayRacesWithLaps(r, data);
			break;
		case 3:
			System.out.println("Enter the races won by playername");
			String data1=s.next();
			rm.displayRacesWonBy(r,data1);
			break;
		case 4:
			System.out.println("Display All lap details");
			break;
			
		}
		

	}

}
