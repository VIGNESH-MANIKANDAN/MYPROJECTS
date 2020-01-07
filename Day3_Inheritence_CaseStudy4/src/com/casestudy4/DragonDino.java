package com.casestudy4;

import java.util.Scanner;

public class DragonDino extends LavDino

{
	
	public DragonDino(String species, String consumptionType) 
	{
		super(species, consumptionType);
		System.out.println("Number of Wings");
		Scanner s=new Scanner(System.in);
		this.numberOfWings=s.nextInt();
		System.out.println("Number of Scales");
		this.numberOfScales=s.nextInt();
		
		
		
		
	}
	int                numberOfWings;
	int                numberOfScales;
	public void               displayDinoDetails ()              //       Display dino species and consumption
	{
		System.out.println("Dragon Dino Properties");
		System.out.println("Flies with "+this.numberOfWings+"\n wings\nHas" +this.numberOfScales+" scales");
		super.displayDinoDetails();
		
	}

}
