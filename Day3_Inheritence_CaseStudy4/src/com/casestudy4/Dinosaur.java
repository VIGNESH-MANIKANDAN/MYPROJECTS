package com.casestudy4;

public class Dinosaur 
{
	public Dinosaur(String species, String consumptionType) {
		super();
		this.species = species;
		this.consumptionType = consumptionType;
	}
	String             species;
	String             consumptionType;
	public void               displayDinoDetails ()              //       Display dino species and consumption
	{
		System.out.println("Base Dino Properties");
		System.out.println(this.species+" is a "+this.consumptionType);
	}

}
