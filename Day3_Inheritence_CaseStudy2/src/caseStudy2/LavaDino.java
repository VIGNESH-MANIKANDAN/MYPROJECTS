package caseStudy2;

import java.util.Scanner;

public class LavaDino 
{
  public LavaDino() {
		super();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter species: ");
		species=sc.nextLine();
		//sc.hasNextLine();
		System.out.println("\n Enter type: ");
		locomotionType=sc.next();
		
		System.out.println("\n Enter speed: ");
		this.locomotionSpeed=sc.nextInt();
	}
public String species,locomotionType;
  public float locomotionSpeed;

public String getSpecies() {
	return species;
}

public void setSpecies(String species) {
	this.species = species;
}

public String getLocomotionType() {
	return locomotionType;
}

public void setLocomotionType(String locomotionType) {
	this.locomotionType = locomotionType;
}

public float getLocomotionSpeed() {
	return locomotionSpeed;
}

public void setLocomotionSpeed(float locomotionSpeed) 
{
	this.locomotionSpeed = locomotionSpeed;
}
 public void displayDinoSpeed ()
 {
}
}
