package com.overloading.casestudy2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
       int distance;
       float jumpheight;
       String sound;
       Cat obj=new Cat(0);
       System.out.println("How much distance your cat can run?");
       Scanner s=new Scanner(System.in);
       distance=s.nextInt();
       System.out.println(obj.generateEnergy(distance)+" energy extracted and added to machine");
       System.out.println("How much feet your cat can jump?");
       //Scanner s=new Scanner(System.in);
       jumpheight=s.nextFloat();
       System.out.println(obj.generateEnergy(jumpheight)+" energy extracted and added to machine");
       System.out.println("How your cat begs for you to give his lunch");
      // Scanner s=new Scanner(System.in);
       sound=s.next();
       System.out.println(obj.generateEnergy(sound)+" energy extracted and added to machine");
       
       obj.runFan(obj.energyReserve);
	}

}
