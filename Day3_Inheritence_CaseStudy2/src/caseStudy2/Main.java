package caseStudy2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ch;
		String species,type;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1. Land Dino\n2. Aqua Dino\n3. Aerial Dino\nEnter choice: ");
		ch=sc.nextInt();
		//species=sc.nextLine();
		//sc.hasNextLine();
		//type=sc.nextLine();
		switch(ch)
		{
		case 1:
			LandLavaDino land=new LandLavaDino();
			land.displayDinoSpeed();
			break;
		case 2:
			WaterLavaDino water=new WaterLavaDino();
			water.displayDinoSpeed();
			break;
		case 3:
			AirLavaDino air=new AirLavaDino();
			air.displayDinoSpeed();
			break;
			
			
		}
		

	}

}
