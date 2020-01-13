package com.polymorphism.casestudy3;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("1.Cotton generator\n2.Telescope(Pattern generator)\n3.Navigate help\nEnter Choice:");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			Machine m=new Machine();
			m.pushBigButton();
			break;
		case 2:
			Telescope t=new Telescope();
			t.pushBigButton();
			break;
		case 3:
			Map mp=new Map();
			mp.pushBigRedButton();
			break;
		}

	}

}
