package com.casestudy4;

import java.util.Scanner;

public class SharkDinoV2 extends SharkDino
{
	
	String             abilityName;
	String             abilityDescription;
	public SharkDinoV2(String species, String consumptionType) {
		super(species, consumptionType);
	
		System.out.println("Abitity name");
		Scanner s=new Scanner(System.in);
		this.abilityName=s.nextLine();
		System.out.println("Description");
		this.abilityDescription=s.nextLine();
	}
	public void               displayDinoDetails ()              //       Display dino species and consumption
	{
		System.out.println("Shark  DinoV2 Properties");
		System.out.println("Special Abitity :"+this.abilityName+"\nDescription: " +this.abilityDescription);
		super.displayDinoDetails();
		
	}
	
	
}
