package com.casestudy5;

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
		"3. Dragon Dinosaur\r\n" + 
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
    	   DragonDino drag=new DragonDino(species,consumption);
    	   drag.displayDinoDetails();
    	   break;
    	   
    	   
    	   
       }
		 
	
		

	}

}
