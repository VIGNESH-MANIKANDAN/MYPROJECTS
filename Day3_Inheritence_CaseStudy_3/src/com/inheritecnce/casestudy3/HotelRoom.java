package com.inheritecnce.casestudy3;

import java.util.Scanner;

public class HotelRoom 
{
	String hotelName;
	int noOfSqClaw,ratePerSqClaw;
	Boolean hasWifi,hasAC;
	public HotelRoom()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hotel name: ");
		hotelName=sc.nextLine();
		System.out.println("Enter room area: ");
		noOfSqClaw=sc.nextInt();
		System.out.println("Enter rate/sq claw: ");
		ratePerSqClaw=sc.nextInt();
		System.out.println("Hotel has Wifi? ");
		//sc.hasNext();
		hasWifi=sc.nextBoolean();
		System.out.println("Hotel has AC? ");
		hasAC=sc.nextBoolean();
	}
	public void calculateTariff()
	{
		System.out.println("Home"+this.hotelName);
		System.out.printf("\nAmount:%d rocks",this.ratePerSqClaw,this.noOfSqClaw*this.ratePerSqClaw);
	}
	
}


