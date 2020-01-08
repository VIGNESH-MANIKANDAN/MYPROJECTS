package com.interfaceCase1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int size;
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter canvas size");
		size=s.nextInt();
		//s.next();
		System.out.println("Please enter type of paint");
		str=s.next();
		System.out.println("Output - Case 1\n-----------------------------\n");
		GlassCanvas glass=new GlassCanvas(str,size);
		glass.paint();
		OilCanvas oil=new OilCanvas(str,size);
		oil.paint();
		RegularCanvas regular=new RegularCanvas(str,size);
		regular.paint();
		

	}

}
