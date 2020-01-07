package com.casestudy4;

import java.util.Scanner;

public class LizardDinoV3 extends LizardDino
{

	public LizardDinoV3(String species, String consumptionType) 
	{
		super(species, consumptionType);
		System.out.println("Super Power name");
		Scanner s=new Scanner(System.in);
		this.superPowerName=s.nextLine();
		System.out.println("Description");
		this.superPowerDescription=s.nextLine();
	}
	String             superPowerName;
	String             superPowerDescription;
	public void               displayDinoDetails ()              //       Display dino species and consumption
	{
		System.out.println("Lizard dino Super power Properties");
		System.out.println("Super powername  :"+this.superPowerName+"\nDescription: " +this.superPowerDescription);
		super.displayDinoDetails();	
	}
}
