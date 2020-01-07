package caseStudy2;

import java.util.Scanner;

public class AirLavaDino extends LavaDino
{
	int numberOfWwings;
	float speedPerWing,ashResistance;
	public AirLavaDino() {
		super();
		
		System.out.println("\n Enter number of wings: ");
		Scanner sc=new Scanner(System.in);
		
		this.numberOfWwings = sc.nextInt();
		System.out.println("\n Enter speed/wing: ");
		this.speedPerWing = sc.nextFloat();
		System.out.println("\n Enter ash resistance: ");
		this.ashResistance = sc.nextFloat();
	}
	
	public void displayDinoSpeed()
	{
		float speed;
		speed=this.locomotionSpeed+(this.numberOfWwings*this.speedPerWing)-this.ashResistance;
		System.out.println("Species="+this.species);
		System.out.printf("Travels by %s at a speed of %d km/h",this.locomotionType,speed);
	}
	public int getNumberOfWwings() {
		return numberOfWwings;
	}
	public void setNumberOfWwings(int numberOfWwings) {
		this.numberOfWwings = numberOfWwings;
	}
	public float getSpeedPerWing() {
		return speedPerWing;
	}
	public void setSpeedPerWing(float speedPerWing) {
		this.speedPerWing = speedPerWing;
	}
	public float getAshResistance() {
		return ashResistance;
	}
	public void setAshResistance(float ashResistance) {
		this.ashResistance = ashResistance;
	}

}
