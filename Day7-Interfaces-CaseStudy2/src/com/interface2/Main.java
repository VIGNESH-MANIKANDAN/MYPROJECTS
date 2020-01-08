package com.interface2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Please choose the place of buy or sell :\n1.ArtExpo\n2.Museum\n3.BlackMarket");
		ch=s.nextInt();
		switch(ch)
		{
		   case 1:
			   int opt;
			   ArtExpo art=new ArtExpo();
			   art.display();
			   System.out.println("Buy(1) or sell(0)");
			   opt=s.nextInt();
			   if(opt==1)
				   System.out.println("You can buy @ Rs: "+art.buy());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ Rs:"+art.sell(p));
				}
			   break;
					   
		   case 2:
			   int opt1;
			   Museum m=new Museum();
			   m.display();
			   System.out.println("Buy(1) or sell(0)");
			   opt1=s.nextInt();
			   if(opt1==1)
				   System.out.println("You can buy @ Rs: "+m.buy());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ Rs:"+m.sell(p));
				}
			   break;	   
		   case 3:
			   int opt2;
			   BalckMarket b=new BalckMarket();
			   b.display();
			   System.out.println("Buy(1) or sell(0)");
			   opt2=s.nextInt();
			   if(opt2==1)
				   System.out.println("You can buy @ Rs: "+b.buy());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ Rs:"+b.sell(p));
				}
			   break;
		}
		

	}

}
