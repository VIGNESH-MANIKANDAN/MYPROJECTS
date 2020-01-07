package com.casestudy5;

import java.util.Scanner;

public class LavDino extends Dinosaur
{
	public LavDino(String species, String consumptionType) 
	{
		super(species, consumptionType);
		System.out.println("BreathFire(y/n)?");
		Scanner s=new Scanner(System.in);
		char breath,heat;
		breath=s.next().charAt(0);
		System.out.println("HeatResistance(y/n)?");
		heat=s.next().charAt(0);
		
		if(breath=='y')
			this.canBreatheFire=true;
		else
			this.canBreatheFire=false;
		
		if(heat=='y')
			this.hasHeatResistance=true;
		else
			this.hasHeatResistance=false;
		
			
	}
	boolean            canBreatheFire;
	boolean            hasHeatResistance;
	public void               displayDinoDetails ()              //       Display dino species and consumption
	{
	  System.out.println("Lava Dino Properties");
	  System.out.print(this.species);
	  if(this.canBreatheFire)
		  System.out.print("brethes Fire");
	  else
		  System.out.print("cannot brethes Fire");
	  if(this.hasHeatResistance)
		  System.out.println("It is resistance to heat");
	  else
		  System.out.println("It is not resistance to heat");
System.out.println(this.species+" is a "+this.consumptionType);
	  
	}
	
}
