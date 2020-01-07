package com.casestudy4;

public class LizardDino extends LavDino
{
	int                numberOfClaws;
	int                numberOfLegs;
	boolean            canRun;

	public LizardDino(String species, String consumptionType) 
	{
		super(species, consumptionType);
	
	}
	public void               displayDinoDetails ()              //       Display dino species and consumption
	{
		System.out.println("Lizard Dino Properties");
		System.out.println("Walks with "+this.numberOfLegs+"\n and has" +this.numberOfClaws+" claws\n");
		super.displayDinoDetails();
		
	}

}
