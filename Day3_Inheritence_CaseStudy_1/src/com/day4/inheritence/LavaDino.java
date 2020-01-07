package com.day4.inheritence;

public class LavaDino extends Dinosar 
{ boolean hasHeatResistance;

public LavaDino(String string, String string2, boolean hasHeatResistance) {
	super(string,string2);
	this.hasHeatResistance = hasHeatResistance;
}

public boolean isHasHeatResistance() {
	return hasHeatResistance;
}

public void setHasHeatResistance(boolean hasHeatResistance) {
	this.hasHeatResistance = hasHeatResistance;
}

public void display() {
	System.out.println("Breed Name: "+this.species);
	System.out.println("Locomotive Type: "+this.locomotionType);
	System.out.println("Survive in Lava: "+this.hasHeatResistance);
	
	
}


}
