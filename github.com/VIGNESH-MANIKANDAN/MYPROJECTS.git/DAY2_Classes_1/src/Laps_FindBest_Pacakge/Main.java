package Laps_FindBest_Pacakge;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException 
	{
	LapManager manager=new LapManager();
	int n,i;
	byte lnum,thr;
	String pname;
	float time;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	n=Integer.parseInt(br.readLine());
	Lap objects[]=new Lap[n];
	for(i=0;i<n;i++)
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
	manager.displayAllLaps(objects);
	manager.displayFastestInLap(objects,(byte)103);
	manager.displayMaximumThrows(objects);
			
	
	

	}

}
