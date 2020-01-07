package caseStudy2;

import java.util.Scanner;

public class WaterLavaDino extends LavaDino 
{
   public WaterLavaDino() {
	   super();
		
		System.out.println("\n Enter number of tailss: ");
		Scanner sc=new Scanner(System.in);
		
		this.numberOfTails = sc.nextInt();
		System.out.println("\n Enter Lava multiplier: ");
		this.lavaMultiplier = sc.nextFloat();
			}

int numberOfFins;
   float numberOfTails,lavaMultiplier;
   
	public void displayDinoSpeed()
	{
		float speed;
		speed=this.locomotionSpeed+(this.numberOfFins+this.numberOfTails)*this.lavaMultiplier;
		System.out.println("Species="+this.species);
		System.out.printf("Travels by %s at a speed of %d km/h",this.locomotionType,speed);
	}

	public int getNumberOfFins() {
		return numberOfFins;
	}

	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}

	public float getNumberOfTails() {
		return numberOfTails;
	}

	public void setNumberOfTails(float numberOfTails) {
		this.numberOfTails = numberOfTails;
	}

	public float getLavaMultiplier() {
		return lavaMultiplier;
	}

	public void setLavaMultiplier(float lavaMultiplier) {
		this.lavaMultiplier = lavaMultiplier;
	}
}
