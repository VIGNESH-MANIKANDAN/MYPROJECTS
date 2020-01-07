package com.inheritecnce.casestudy3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ch;
		System.out.println("1. Deluxe Room\r\n" + 
				"\r\n" + 
				"2. Deluxe AC Room\r\n" + 
				"\r\n" + 
				"3. Luxury Suite\r\n" + 
				"\r\n" +
				"Choose room: ");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			DeluxRoom droom=new DeluxRoom();
			droom.calculateTariff();
			break;
		case 2:
			DeluxACRoom dac=new DeluxACRoom();
			dac.calculateTariff();
			break;
		case 3:
			SuiteACRoom suite=new SuiteACRoom();
			suite.calculateTariff();
			break;
			
		}
		

	}

}
