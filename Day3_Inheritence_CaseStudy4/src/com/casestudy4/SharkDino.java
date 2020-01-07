package com.casestudy4;

import java.util.Scanner;

public class SharkDino extends LavDino 
{
	int                numberOfFins;
	int                numberOfGills;
	boolean            canSwim;
	public SharkDino(String species, String consumptionType) 
	{
		super(species, consumptionType);
		System.out.println("Number of Fins");
		Scanner s=new Scanner(System.in);
		this.numberOfFins=s.nextInt();
		System.out.println("Number of gills");
		this.numberOfGills=s.nextInt();
		
		
	}
	public void               displayDinoDetails ()              //       Display dino species and consumption
	{
		System.out.println("Shark Dino Properties");
		System.out.println("Swims with "+this.numberOfFins+"\n fins \nHas" +this.numberOfGills+" \n");
		super.displayDinoDetails();
		
	}


}
