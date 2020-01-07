package caseStudy2;

import java.util.Scanner;

public class LandLavaDino extends LavaDino
{
	public LandLavaDino() {
		
		super();
		System.out.println("\n Enter number of legs: ");
		Scanner sc=new Scanner(System.in);
		this.numberOfLegs=sc.nextInt();
	
	}

	int numberOfLegs;

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	public void displayDinoSpeed()
	{
		float speed;
		speed=this.locomotionSpeed*this.numberOfLegs;
		System.out.println("Species="+this.species);
		System.out.printf("Travels by %s at a speed of %d km/h",this.locomotionType,speed);
	}

}
