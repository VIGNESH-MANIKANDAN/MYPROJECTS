package com.interface2;

import java.util.Scanner;

public class BalckMarket extends Expo implements iTrade
{
	public float           buy()
	{
		float ans=0;
		 for(int i=0;i<3;i++)
		 {
		    	System.out.printf("\n%s",this.list[i].typeOfPainting);
		    	
		 }
		System.out.println("Which painiting you want to buy?");
		int ch;
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		if(ch==1)
		{
			ans=(float)(this.list[0].value*0.5);
		}
		else if(ch==2)
		{
			ans=(float)(this.list[1].value*1.75);
		}
		else if(ch==3)
		{
			ans=(float)(this.list[1].value*2.75);
		}
		return ans;
		
		
	}
	BalckMarket()
	{
		super();
	}
	public float sell(Painting pobj)
	{
		float price=0;
		if(pobj.typeOfPainting.equals(list[0].typeOfPainting))
		{
			price=(float)(this.list[0].value*0.25);
		}
		else if(pobj.typeOfPainting.equals(list[1].typeOfPainting))
		{
			price=(float)(this.list[1].value*1.35);
		}
		else if(pobj.typeOfPainting.equals(list[2].typeOfPainting))
		{
			price=(float)(this.list[1].value*2.25);
		}
		return price;
	
	}


}
