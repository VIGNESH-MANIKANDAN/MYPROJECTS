package com.casestudy4;

import java.util.Scanner;

public class DragonDinoV3 extends DragonDinoV2
{
	String             superPowerName;
	String             superPowerDescription;
	public DragonDinoV3(String species, String consumptionType) 
	{
		super(species, consumptionType);
		System.out.println("Super Power name");
		Scanner s=new Scanner(System.in);
		this.superPowerName=s.nextLine();
		System.out.println("Description");
		this.superPowerDescription=s.nextLine();
		
	}
	public void               displayDinoDetails ()              //       Display dino species and consumption
	{
		System.out.println("Dragon Super power Properties");
		System.out.println("Super powername  :"+this.superPowerName+"\nDescription: " +this.superPowerDescription);
		super.displayDinoDetails();	
	}

}
