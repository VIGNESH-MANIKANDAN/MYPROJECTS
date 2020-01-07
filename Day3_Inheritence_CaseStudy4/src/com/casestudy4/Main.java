package com.casestudy4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int ch;
		Scanner s=new Scanner(System.in);
System.out.println("1. Dinosaur\r\n" + 
		"\r\n" + 
		"2. Lava Dinosaur\r\n" + 
		"\r\n" + 
		"3. Dragon v3 Dinosaur\r\n" + 
		"\r\n"+ "4.Lizard Dinosaur v3\r\n" + 
		"\r\n" + 
		"5. Shark v3 Dinosaur\r\n" + 
		"\r\n" );
       ch=s.nextInt();
       String species,consumption;
	   System.out.println("Enter species");
	   species=s.next();
	   System.out.println("Enter consumption");
	   consumption=s.next();
	   
       switch(ch)
       {
       case 1:
    	   Dinosaur d=new Dinosaur(species,consumption);
    	   d.displayDinoDetails();
    	   break;
       case 2:
    	   LavDino lava=new LavDino(species,consumption);
    	   lava.displayDinoDetails();
    	   break;
       case 3:
    	   DragonDinoV3 drag=new DragonDinoV3(species,consumption);
    	   drag.displayDinoDetails();
    	   break;
       case 4:   
    	   LizardDinoV3 liz=new LizardDinoV3(species,consumption);
    	   liz.displayDinoDetails();
    	   break;
       case 5:   
    	   SharkDinoV3 shark=new SharkDinoV3(species,consumption);
    	   shark.displayDinoDetails();
    	   break;
    	   
       }
		 
	
		

	}

}
