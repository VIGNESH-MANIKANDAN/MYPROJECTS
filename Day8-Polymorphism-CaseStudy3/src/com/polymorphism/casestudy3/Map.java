package com.polymorphism.casestudy3;

import java.util.Scanner;

public class Map 
{
  String directions;
  public void pushBigRedButton()
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the location you want to go");
	  this.directions=s.next();
	  if(this.directions.equalsIgnoreCase("Museum"))
	  {
		  System.out.println("Go to (5,6)");
	  }
	  else if(this.directions.equalsIgnoreCase("restaurant"))
	  {
		  System.out.println("Go to (0,-2)");
	  }
	  else if(this.directions.equalsIgnoreCase("home"))
	  {
		  System.out.println("Go to (3,-5)");
	  }
	  else if(this.directions.equalsIgnoreCase("lab"))
	  {
		  System.out.println("Go to (0,0)");
	  }
	  else
	  {
		  System.out.println("No information found");
	  }
  }
}
